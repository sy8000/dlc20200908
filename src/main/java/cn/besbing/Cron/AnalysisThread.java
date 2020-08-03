package cn.besbing.Cron;

import cn.besbing.CommonUtils.MaintainModel.SpringUtil;
import cn.besbing.Entities.*;
import cn.besbing.Service.Impl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@Component
public class AnalysisThread {

    private  static final String CRON = "0 0 0 * * ?";

    private Logger logger = LoggerFactory.getLogger(AnalysisThread.class);

    private CustomerSqlServiceImpl customerSqlService = SpringUtil.getBean(CustomerSqlServiceImpl.class);

    private INcAnalysisListServiceImpl iNcAnalysisListService = SpringUtil.getBean(INcAnalysisListServiceImpl.class);

    private IAnalysisServiceImpl iAnalysisService = SpringUtil.getBean(IAnalysisServiceImpl.class);

    private IComponentServiceImpl iComponentService = SpringUtil.getBean(IComponentServiceImpl.class);

    private INcComponentTableImpl iNcComponentTable = SpringUtil.getBean(INcComponentTableImpl.class);


    /**
     * 获取analysis表中存在、但nc_analysis_list表中不存在的条目,判断依据:analysis.name、analysis.version
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    //@Scheduled(cron = "0 0 1 * * ?")
    public void onlyAddAnalysisThread() throws Exception {
        Analysis analysis = new Analysis();
        NcAnalysisList ncAnalysisList = null;
        List<Analysis> analysisReturnList = new ArrayList<>();
        List<Analysis> analysisAllList = new ArrayList<>();
        try{
            logger.info("开始获取全部analysis分析..........");
            analysisAllList  = iAnalysisService.selectAnalysisByNothing();
            logger.info("结束获取全部analysis分析..........");
        }catch (Exception e){
            logger.error("analysis查询错误");
        }
        if (analysisAllList.size() > 0){
            for (Analysis allanalysislist : analysisAllList){
                /*if ("非标-耐久性".equals(allanalysislist.getName())){
                    logger.info("...................................................................");
                }*/
                ncAnalysisList = new NcAnalysisList();
                ncAnalysisList.setName(allanalysislist.getName());
                ncAnalysisList.setVersion(allanalysislist.getVersion());
                try{
                    ncAnalysisList = iNcAnalysisListService.selectByAnalysisKey(ncAnalysisList);
                    //如果为企标初始参数
                    if("继电器企标初始参数".equals(allanalysislist.getName().trim())){
                        /**
                         * 逻辑：首先取出写入语句
                         * 然后取出现有analysis中的component进行for循环
                         * 如果nc_component_table中不存在，则添加
                         */
                        ComponentDefKey componentDefKey = new ComponentDefKey();
                        componentDefKey.setAnalysis("继电器企标初始参数");
                        componentDefKey.setVersion(Long.valueOf(1));
                        //NcComponentTableKey ncComponentTableKey = new NcComponentTableKey();
                        NcComponentTable ncComponentTableKey = new NcComponentTable();
                        List<Component> componentList = iComponentService.selectByTS(componentDefKey);
                        NcComponentTable ncComponentTable = null;
                        String componentSql = "";
                        String exist = "";
                        for (Component c : componentList){
                            ncComponentTableKey.setAnalysis(c.getAnalysis().trim());
                            ncComponentTableKey.setName(c.getName().trim());
                            ncComponentTableKey.setNcComponentName(c.getName().trim());
                            ncComponentTableKey.setVersion(Long.valueOf(c.getVersion().toString().trim()));
                            //ncComponentTable = iNcComponentTable.getNcComponentTableByPrimaryKey(ncComponentTableKey);
                            exist = customerSqlService.selectOne("select 1 from nc_component_table where NC_COMPONENT_NAME = '"+ c.getName().trim() +"' and ANALYSIS = '"+ c.getAnalysis().trim() +"' and NAME = '"+ c.getName() +"' and VERSION = 1");
                            if (exist == null){
                                componentSql = customerSqlService.selectOne("select sql_text from sql_records where sql_code like 'analysis4' ");
                                componentSql = componentSql.replace("sheny",c.getAnalysis());
                                componentSql = componentSql.replace("why",String.valueOf(c.getVersion()));
                                componentSql = componentSql.replace("dataloader",c.getName());
                                customerSqlService.insert(componentSql);
                            }
                        }
                    }
                    //如果查到，什么也不做，如果查不到立即更新
                    if (ncAnalysisList == null){
                        logger.info("================================={}===============================",allanalysislist.getName());
                        logger.info("开始查询添加analysis语句...........");
                        List<String> addAnalysisSqls = customerSqlService.selectAsList("select sql_text from sql_records where sql_code like 'analysis%' ");
                        logger.info("结束查询添加analysis语句...........");
                        for (String analysisSql : addAnalysisSqls){
                            //逐条插入分析，每个分析三条语句
                            analysisSql = analysisSql.replace("sheny",allanalysislist.getName());
                            analysisSql = analysisSql.replace("why",String.valueOf(allanalysislist.getVersion()));
                            try{
                                logger.info("开始执行语句{}..........",analysisSql);
                                customerSqlService.insert(analysisSql);
                                logger.info("结束执行语句{}..........",analysisSql);
                            }catch (Exception e) {
                                logger.error("分析添加错误...语句：{}", analysisSql);
                            }
                        }
                    }
                }catch (Exception e){
                    logger.error("在nc_analysis_list:analysis表中查询出错........cause:{}" , e.getStackTrace());
                    throw new Exception("原因:" + e.getStackTrace());
                }
            }
        }else {
            throw new Exception("查询analysis数量小于1");
        }
        //return analysisReturnList;
    }

    /**
     * 逻辑：
     * 首先获取product表，然后去与NC_PROD_LIST表比较，没有则插入
     * 获取test_list表，去与NC_TEST_LIST比较，没有则插入
     * 通过product表的name、code去判断NC_BASPROD_NAME/NC_BASPROD_TYPE/NC_BASEN_TYPE
     * 获取product_grade表，确定NC_BASPROD_POINT/NC_BASPROD_STRUCT表
     * 通过product,判断NC_BASPROD_CONTACT表
     * 通过prod_grade_STAGE判断NC_BASPROD_TEMP
     * 插入NC_SAMPLE_INFO
     * 通过product表插入NC_TEST_INIT
     * 通过test_list名，判断NC_TASK_ADDUNION
     * 通过test_list_comp。test_list判断NC_TESTLIST_COMP
     * 通过product判断nc_test_after
     *
     * @throws Exception
     */

    private IProductServiceImpl iProductService = SpringUtil.getBean(IProductServiceImpl.class);
    private INcProdListServiceImpl iNcProdListService = SpringUtil.getBean(INcProdListServiceImpl.class);
    private INcTestListServiceImpl iNcTestListService = SpringUtil.getBean(INcTestListServiceImpl.class);
    private NcBaseprodNameServiceImpl ncBaseprodNameService = SpringUtil.getBean(NcBaseprodNameServiceImpl.class);
    private INcBasprodTypeServiceImpl iNcBasprodTypeService = SpringUtil.getBean(INcBasprodTypeServiceImpl.class);
    private INcBasenTypeServiceImpl iNcBasenTypeService = SpringUtil.getBean(INcBasenTypeServiceImpl.class);
    private INcBasprodPointServiceImpl iNcBasprodPointService = SpringUtil.getBean(INcBasprodPointServiceImpl.class);
    private INcBasprodStruceServiceImpl iNcBasprodStruceService = SpringUtil.getBean(INcBasprodStruceServiceImpl.class);
    private INcBasprodContactServiceImpl iNcBasprodContactService = SpringUtil.getBean(INcBasprodContactServiceImpl.class);
    private INcSampleInfoServiceImpl iNcSampleInfoService = SpringUtil.getBean(INcSampleInfoServiceImpl.class);
    private INcTestInitImpl iNcTestInit = SpringUtil.getBean(INcTestInitImpl.class);
    private INcTaskAddunionImpl iNcTaskAddunion = SpringUtil.getBean(INcTaskAddunionImpl.class);
    private INcTestlistCompServiceImpl iNcTestlistCompService = SpringUtil.getBean(INcTestlistCompServiceImpl.class);
    private INcTestAfterServiceImpl iNcTestAfterService = SpringUtil.getBean(INcTestAfterServiceImpl.class);
    private INcBasProdTempServiceImpl iNcBasProdTempService = SpringUtil.getBean(INcBasProdTempServiceImpl.class);

    @Transactional(rollbackFor = Exception.class)
    //@Scheduled(cron = "0 0 4 * * ?")
    public void addTestListThread() throws Exception {
        //获取所有在用product
        List<Product> productsList = new ArrayList<>();
        try{
            productsList = iProductService.getAllProduct();
        }catch (Exception e){
            logger.error("获取全部product时出错...");
        }
        if (productsList.size() < 1){
            logger.info("获取的product总数小于1");
            throw new Exception("获取的product总数小于1");
        }else{
            //product的list不为0时才正式运行
            String productName = "";
            String productCode = "";
            String productTestlist = "";
            String productVersion = "";
            NcProdListKey ncProdListKey = null;
            String executeSql = "";
            logger.info("product数量>0，testlist同步正式开始......");
            /**
             * 开始定义所有需组装的vo
             */
            NcProdList ncProdList = new NcProdList();


            for(Product product : productsList){
                ncProdListKey = new NcProdListKey();
                ncProdListKey.setName(product.getName());
                ncProdListKey.setVersion(product.getVersion());

                /*productName = product.getName();
                productCode = product.getCode();
                productTestlist = product.getTestList();
                productVersion = String.valueOf(product.getVersion());*/
                /************
                 *
                 * 2020/6/6  sheny review
                 * content : 每张表返回pk存入相应变量，下面用时直接拿
                 *
                 ***********/
                try{
                    ncProdList = iNcProdListService.getNcProdListByPrimary(ncProdListKey);
                }catch (Exception e){
                    logger.error("ncProdList查询出错...cause:{}",e.getStackTrace());
                }
                if (ncProdList == null){
                    //如果不存在，则开始更新
                    logger.info("product:{},version:{},开始更新...",product.getName(),product.getVersion());
                    if ("QFVF4241-2020".equals(product.getName()) && "1".equals(product.getVersion().toString())){
                        logger.debug("====={}====={}=======",product.getName(),product.getVersion().toString());
                    }
                    Long version = Long.valueOf(product.getVersion().toString());
                    /*
                    开始定义各vo
                     */
                    NcProdList insertncProdList = new NcProdList();
                    NcTestList inserttestList = new NcTestList();
                    NcBasprodName insertncBasprodName = new NcBasprodName();
                    NcBasprodType insertncBasprodType = new NcBasprodType();
                    NcBasenType insertncBasenType = new NcBasenType();
                    NcBasprodPoint insertncBasprodPoint = new NcBasprodPoint();
                    List<String> pkBasprodPoint = new ArrayList<>();
                    NcBasprodStruct insertncBasprodStruct = new NcBasprodStruct();
                    List<String> pkBasprodStruct = new ArrayList<>();
                    NcBasprodContact insertncBasprodContact = new NcBasprodContact();
                    NcBasprodTemp insertncBasprodTemp = new NcBasprodTemp();
                    List<String> pkBasprodTemp = new ArrayList<>();
                    NcSampleInfo insertncSampleInfo = new NcSampleInfo();
                    List<String> pkSampleInfo = new ArrayList<>();
                    NcTestInit insertncTestInit = new NcTestInit();
                    NcTaskAddunion insertncTaskAddunion = new NcTaskAddunion();
                    NcTestlistComp insertncTestListComp = new NcTestlistComp();
                    NcTestAfter insertncTestAfter = new NcTestAfter();

                    try {
                        logger.info("开始组装nc_prod_list...");
                        executeSql = getExecuteSql("testlist_nc_prod_list",product);
                        //insertncProdList = customerSqlService.selectAsList(executeSql);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            //logger.info(map.get("PK_PROD_LIST").toString());
                            insertncProdList.setPkProdList(map.get("PK_PROD_LIST").toString());
                            insertncProdList.setName(map.get("NAME").toString());
                            insertncProdList.setVersion(Long.valueOf(map.get("VERSION").toString()));
                            insertncProdList.setNcProdCode(map.get("NC_PROD_CODE").toString());
                            insertncProdList.setNcProdName(map.get("NC_PROD_NAME").toString());
                            insertncProdList.setNcProdIsdisable(BigDecimal.valueOf(Long.valueOf(map.get("NC_PROD_ISDISABLE").toString())));
                            insertncProdList.setDef1(map.get("DEF1").toString());
                            insertncProdList.setDef2(map.get("DEF2").toString());
                            insertncProdList.setDef3(map.get("DEF3").toString());
                            insertncProdList.setDef4(map.get("DEF4").toString());
                            insertncProdList.setDef5(map.get("DEF5").toString());
                            insertncProdList.setNcProdDes(map.get("NC_PROD_DES").toString());
                            insertncProdList.setNcProdAlias(map.get("NC_PROD_ALIAS").toString());
                            iNcProdListService.insert(insertncProdList);
                        }
                        logger.info("结束组装nc_prod_list...");
                    }catch (Exception e){
                        logger.error("更新nc_prod_list表时出现异常：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_test_list...");
                        executeSql = getExecuteSql("testlist_nc_test_list",product);
                        customerSqlService.insert(executeSql);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            inserttestList.setPkTestList(map.get("PK_TEST_LIST").toString());
                            inserttestList.setName(map.get("NAME").toString());
                            inserttestList.setNcTestlistCode(map.get("NC_TESTLIST_CODE").toString());
                            inserttestList.setNcTestlistName(map.get("NC_TESTLIST_NAME").toString());
                            inserttestList.setNcTestlistIsdisable(BigDecimal.valueOf(Long.valueOf(map.get("NC_TESTLIST_ISDISABLE").toString())));
                            inserttestList.setDef1(map.get("DEF1").toString());
                            inserttestList.setDef2(map.get("DEF2").toString());
                            inserttestList.setDef3(map.get("DEF3").toString());
                            inserttestList.setDef4(map.get("DEF4").toString());
                            inserttestList.setDef5(map.get("DEF5").toString());
                            String temp = customerSqlService.selectOne("select PK_TEST_LIST from nc_test_list where trim(name) = '" + inserttestList.getName().trim() + "'");
                            if (temp != null){
                                customerSqlService.delete("delete from nc_test_list where PK_TEST_LIST = '" + temp + "'");
                                inserttestList.setPkTestList(temp);
                            }
                            iNcTestListService.insert(inserttestList);
                        }
                        logger.info("结束组装nc_test_list...");
                    }catch(Exception e){
                        logger.error("更新nc_test_list表时出现异常：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_basprod_name...");
                        executeSql = getExecuteSql("testlist_nc_basprod_name",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            insertncBasprodName.setPkBasprodName(map.get("PK_BASPROD_NAME").toString());
                            insertncBasprodName.setNcBasprodCode(map.get("NC_BASPROD_CODE").toString());
                            insertncBasprodName.setNcBasprodName(map.get("NC_BASPROD_NAME").toString());
                            insertncBasprodName.setVdef1(map.get("VDEF1").toString());
                            insertncBasprodName.setVdef2(map.get("VDEF2").toString());
                            insertncBasprodName.setVdef3(map.get("VDEF3").toString());
                            insertncBasprodName.setVdef4(map.get("VDEF4").toString());
                            insertncBasprodName.setVdef5(map.get("VDEF5").toString());
                            ncBaseprodNameService.insert(insertncBasprodName);
                        }
                        logger.info("结束组装nc_basprod_name...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_name出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_basprod_type...");
                        executeSql = getExecuteSql("testlist_nc_basprod_type",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            insertncBasprodType.setPkBasprodType(map.get("PK_BASPROD_TYPE").toString());
                            insertncBasprodType.setNcBasprodtypeCode(map.get("NC_BASPRODTYPE_CODE").toString());
                            insertncBasprodType.setNcBasprodtypeName(map.get("NC_BASPRODTYPE_NAME").toString());
                            insertncBasprodType.setVdef1(map.get("VDEF1").toString().trim());
                            insertncBasprodType.setVdef2(map.get("VDEF2").toString().trim());
                            insertncBasprodType.setVdef3(map.get("VDEF3").toString());
                            insertncBasprodType.setVdef4(map.get("VDEF4").toString());
                            insertncBasprodType.setVdef5(map.get("VDEF5").toString());
                            iNcBasprodTypeService.insert(insertncBasprodType);
                        }
                        logger.info("结束组装nc_basprod_type...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_type出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装NC_BASEN_TYPE...");
                        executeSql = getExecuteSql("testlist_nc_basen_type",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            insertncBasenType.setPkBasenType(map.get("PK_BASEN_TYPE").toString());
                            insertncBasenType.setPkBasprodType(insertncBasprodType.getPkBasprodType().toString());
                            insertncBasenType.setNcBasenCode(map.get("NC_BASEN_CODE").toString());
                            insertncBasenType.setNcBbasenName(map.get("NC_BBASEN_NAME").toString());
                            insertncBasenType.setVdef1(map.get("VDEF1").toString());
                            insertncBasenType.setVdef2(map.get("VDEF2").toString());
                            insertncBasenType.setVdef3(map.get("VDEF3").toString());
                            insertncBasenType.setVdef4(map.get("VDEF4").toString());
                            insertncBasenType.setVdef5(map.get("VDEF5").toString());
                            iNcBasenTypeService.insert(insertncBasenType);
                        }
                        logger.info("结束组装NC_BASEN_TYPE...");
                    }catch(Exception e){
                        logger.error("组装NC_BASEN_TYPE出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_basprod_point...");
                        executeSql = getExecuteSql("testlist_nc_basprod_point",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        pkBasprodPoint.clear();
                        for (Map<String,Object> map : list){
                            pkBasprodPoint.add(map.get("PK_BASPROD_POINT").toString());
                            insertncBasprodPoint.setPkBasprodPoint(map.get("PK_BASPROD_POINT").toString());
                            insertncBasprodPoint.setNcBasprodpointCode(map.get("NC_BASPRODPOINT_CODE").toString());
                            insertncBasprodPoint.setNcBasprodpointName(map.get("NC_BASPRODPOINT_NAME").toString());
                            insertncBasprodPoint.setVdef1(map.get("VDEF1").toString());
                            insertncBasprodPoint.setVdef2(map.get("VDEF2").toString());
                            insertncBasprodPoint.setVdef3(map.get("VDEF3").toString());
                            insertncBasprodPoint.setVdef4(map.get("VDEF4").toString());
                            insertncBasprodPoint.setVdef5(map.get("VDEF5").toString());
                            iNcBasprodPointService.insert(insertncBasprodPoint);
                        }
                        logger.info("结束组装nc_basprod_point...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_point出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_basprod_struct...");
                        executeSql = getExecuteSql("testlist_nc_basprod_struct",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        pkBasprodStruct.clear();
                        for (Map<String,Object> map : list){
                            insertncBasprodStruct.setPkBasprodStruct(map.get("PK_BASPROD_STRUCT").toString());
                            pkBasprodStruct.add(insertncBasprodStruct.getPkBasprodStruct());
                            insertncBasprodStruct.setNcBasprodstructCode(map.get("NC_BASPRODSTRUCT_CODE").toString());
                            insertncBasprodStruct.setNcBasprodstructName(map.get("NC_BASPRODSTRUCT_NAME").toString());
                            insertncBasprodStruct.setVdef1(map.get("VDEF1").toString());
                            insertncBasprodStruct.setVdef2(map.get("VDEF2").toString());
                            insertncBasprodStruct.setVdef3(map.get("VDEF3").toString());
                            insertncBasprodStruct.setVdef4(map.get("VDEF4").toString());
                            insertncBasprodStruct.setVdef5(map.get("VDEF5").toString());
                            iNcBasprodStruceService.insert(insertncBasprodStruct);
                        }
                        logger.info("结束组装nc_basprod_struct...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_struct出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装NC_BASPROD_CONTACT...");
                        executeSql = getExecuteSql("testlist_nc_basprod_contact",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            insertncBasprodContact.setPkBasprodContact(map.get("PK_BASPROD_CONTACT").toString());
                            insertncBasprodContact.setNcBasprodcontactCode(map.get("NC_BASPRODCONTACT_CODE").toString());
                            insertncBasprodContact.setNcBasprodcontactName(map.get("NC_BASPRODCONTACT_NAME").toString());
                            insertncBasprodContact.setVdef1(map.get("VDEF1").toString());
                            insertncBasprodContact.setVdef2(map.get("VDEF2").toString());
                            insertncBasprodContact.setVdef3(map.get("VDEF3").toString());
                            insertncBasprodContact.setVdef4(map.get("VDEF4").toString());
                            insertncBasprodContact.setVdef5(map.get("VDEF5").toString());
                            iNcBasprodContactService.insert(insertncBasprodContact);
                        }
                        logger.info("结束组装NC_BASPROD_CONTACT...");
                    }catch(Exception e){
                        logger.error("组装NC_BASPROD_CONTACT出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_basprod_temp...");
                        executeSql = getExecuteSql("testlist_nc_basprod_temp",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        pkBasprodTemp.clear();
                        for (Map<String,Object> map : list){
                            insertncBasprodTemp.setPkBasprodTemp(map.get("PK_BASPROD_TEMP").toString());
                            pkBasprodTemp.add(map.get("PK_BASPROD_TEMP").toString());
                            insertncBasprodTemp.setNcBasprodtempCode(map.get("NC_BASPRODTEMP_CODE").toString());
                            insertncBasprodTemp.setNcBasprodtempName(map.get("NC_BASPRODTEMP_NAME").toString());
                            insertncBasprodTemp.setVdef1(map.get("VDEF1").toString());
                            insertncBasprodTemp.setVdef2(map.get("VDEF2").toString());
                            insertncBasprodTemp.setVdef3(map.get("VDEF3").toString());
                            insertncBasprodTemp.setVdef4(map.get("VDEF4").toString());
                            insertncBasprodTemp.setVdef5(map.get("VDEF5").toString());
                            iNcBasProdTempService.insert(insertncBasprodTemp);
                        }
                        logger.info("结束组装nc_basprod_temp...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_temp出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_sample_info...");
                        //executeSql = getExecuteSql("testlist_nc_sample_info",product);
                        String sql1 = customerSqlService.selectOne("select sql_text from sql_records where sql_code = 'testlist_nc_sample_info1'");
                        String sql2 = customerSqlService.selectOne("select sql_text from sql_records where sql_code = 'testlist_nc_sample_info2'");
                        executeSql = sql1 + sql2;
                        executeSql = executeSql.replace("prosheny",product.getName());
                        executeSql = executeSql.replace("why",String.valueOf(product.getVersion()));
                        executeSql = executeSql.replace("ccode",product.getCode());
                        executeSql = executeSql.replace("ttestlist",product.getTestList());
                        String finalSql = "";
                        //数据库中语句获取完成，开始处理语句
                        for(String point : pkBasprodPoint){
                            for (String struct : pkBasprodStruct){
                                for(String temp : pkBasprodTemp){
                                    finalSql = executeSql;
                                    //finalSql = finalSql.replace("listsheny_pk_basprod_name",insertncProdList.getPkProdList());
                                    //finalSql = finalSql.replace("",inserttestList.getPkTestList());
                                    finalSql = finalSql.replace("listsheny_pk_basprod_name",insertncBasprodName.getPkBasprodName());
                                    finalSql = finalSql.replace("listsheny_pk_basprod_type",insertncBasprodType.getPkBasprodType());
                                    //finalSql = finalSql.replace("",insertncBasenType.getPkBasenType());
                                    finalSql = finalSql.replace("listsheny_pk_basprod_point",point);
                                    finalSql = finalSql.replace("listsheny_pk_basprod_struct",struct);
                                    finalSql = finalSql.replace("listsheny_pk_basprod_contact",insertncBasprodContact.getPkBasprodContact());
                                    finalSql = finalSql.replace("listsheny_pk_basprod_temp",temp);
                                    List<Map<String,Object>> list =  customerSqlService.selectList(finalSql);
                                    if (list != null){
                                        for (Map<String,Object> map : list){
                                            pkSampleInfo.add(map.get("PK_SAMPLE_INFO").toString());
                                            insertncSampleInfo.setPkSampleInfo(map.get("PK_SAMPLE_INFO").toString());
                                            insertncSampleInfo.setPkProdType(map.get("PK_PROD_TYPE").toString());
                                            insertncSampleInfo.setPkBasprodName(map.get("PK_BASPROD_NAME").toString());
                                            insertncSampleInfo.setPkBasprodType(map.get("PK_BASPROD_TYPE").toString());
                                            insertncSampleInfo.setPkBasprodPoint(map.get("PK_BASPROD_POINT").toString());
                                            insertncSampleInfo.setPkBasprodStruct(map.get("PK_BASPROD_STRUCT").toString());
                                            insertncSampleInfo.setPkBasprodContact(map.get("PK_BASPROD_CONTACT").toString());
                                            insertncSampleInfo.setPkBasprodTemp(map.get("PK_BASPROD_TEMP").toString());
                                            insertncSampleInfo.setPkBasenType(map.get("PK_BASEN_TYPE").toString());
                                            insertncSampleInfo.setSampleInfoCode(map.get("SAMPLE_INFO_CODE").toString());
                                            insertncSampleInfo.setDef1(map.get("DEF1").toString());
                                            insertncSampleInfo.setDef2(map.get("DEF2").toString());
                                            insertncSampleInfo.setDef3(map.get("DEF3").toString());
                                            insertncSampleInfo.setDef4(map.get("DEF4").toString());
                                            insertncSampleInfo.setDef5(map.get("DEF5").toString());
                                            insertncSampleInfo.setName(map.get("NAME").toString());
                                            insertncSampleInfo.setcProdTypeC1(map.get("C_PROD_TYPE_C1").toString());
                                            insertncSampleInfo.setDescription(map.get("DESCRIPTION").toString());
                                            insertncSampleInfo.setEnstard(map.get("ENSTARD").toString());
                                            insertncSampleInfo.setTestList(map.get("TEST_LIST").toString());
                                            insertncSampleInfo.setSamplingPoint(map.get("SAMPLING_POINT").toString());
                                            insertncSampleInfo.setGrade(map.get("GRADE").toString());
                                            insertncSampleInfo.setcAllowedContact(map.get("C_ALLOWED_CONTACT").toString());
                                            insertncSampleInfo.setStage(map.get("STAGE").toString());
                                            insertncSampleInfo.setIsenable(BigDecimal.valueOf(Long.valueOf(map.get("ISENABLE").toString())));
                                            iNcSampleInfoService.insert(insertncSampleInfo);
                                        }
                                    }
                                }
                            }
                        }
                        logger.info("结束组装nc_sample_info...");
                    }catch(Exception e){
                        logger.error("组装nc_sample_info出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_test_init...");
                        executeSql = getExecuteSql("testlist_nc_test_init",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            insertncTestInit.setPkTestInit(map.get("PK_TEST_INIT").toString());
                            insertncTestInit.setPkResultType(map.get("PK_RESULT_TYPE").toString());
                            insertncTestInit.setPkUnitsType(map.get("PK_UNITS_TYPE").toString());
                            insertncTestInit.setTestInitCode(map.get("TEST_INIT_CODE").toString());
                            insertncTestInit.setTestInitName(map.get("TEST_INIT_NAME").toString());
                            insertncTestInit.setNcEnstard(map.get("NC_ENSTARD").toString());
                            insertncTestInit.setNcEntry(Long.valueOf(map.get("NC_ENTRY").toString()));
                            insertncTestInit.setNcAnalysisName(map.get("NC_ANALYSIS_NAME").toString());
                            insertncTestInit.setNcAnalysisVersion(Long.valueOf(map.get("NC_ANALYSIS_VERSION").toString()));
                            insertncTestInit.setNcAnalysisType(map.get("NC_ANALYSIS_TYPE").toString());
                            insertncTestInit.setNcSpecRule(map.get("NC_SPEC_RULE").toString());
                            insertncTestInit.setNcMinValue(map.get("NC_MIN_VALUE").toString());
                            insertncTestInit.setNcMaxValue(map.get("NC_MAX_VALUE").toString());
                            insertncTestInit.setNcTextValue(map.get("NC_TEXT_VALUE").toString());
                            insertncTestInit.setNcStage(map.get("NC_STAGE").toString());
                            insertncTestInit.setNcSamplePoint(map.get("NC_SAMPLE_POINT").toString());
                            insertncTestInit.setNcContactType(map.get("NC_CONTACT_TYPE").toString());
                            insertncTestInit.setNcCoilType(map.get("NC_COIL_TYPE").toString());
                            insertncTestInit.setNcCoilCurrent(map.get("NC_COIL_CURRENT").toString());
                            insertncTestInit.setDef1(map.get("DEF1").toString());
                            insertncTestInit.setDef2(map.get("DEF2").toString());
                            insertncTestInit.setDef3(map.get("DEF3").toString());
                            insertncTestInit.setDef4(map.get("DEF4").toString());
                            insertncTestInit.setDef5(map.get("DEF5").toString());
                            iNcTestInit.insert(insertncTestInit);
                        }
                        logger.info("结束组装nc_test_init...");
                    }catch(Exception e){
                        logger.error("组装nc_test_init出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_task_addunion...");
                        executeSql = getExecuteSql("testlist_nc_task_addunion",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            insertncTaskAddunion.setPkTaskAddunion(map.get("PK_TASK_ADDUNION") == null?"-":map.get("PK_TASK_ADDUNION").toString());
                            insertncTaskAddunion.setNcTaskAddcode(map.get("NC_TASK_ADDCODE").toString());
                            insertncTaskAddunion.setNcTaskAddname(map.get("NC_TASK_ADDNAME").toString());
                            insertncTaskAddunion.setNcTestlistName(map.get("NC_TESTLIST_NAME").toString());
                            insertncTaskAddunion.setNcAnalysisMethod(map.get("NC_ANALYSIS_METHOD").toString());
                            insertncTaskAddunion.setNcReportName(map.get("NC_REPORT_NAME").toString());
                            insertncTaskAddunion.setNcTaskType(map.get("NC_TASK_TYPE").toString());
                            insertncTaskAddunion.setNcTaskDes(map.get("NC_TASK_DES").toString());
                            insertncTaskAddunion.setNcTaskName(map.get("NC_TASK_NAME").toString());
                            insertncTaskAddunion.setNcIncludeProtype(map.get("NC_INCLUDE_PROTYPE").toString());
                            insertncTaskAddunion.setNcCbPlan(map.get("NC_CB_PLAN").toString());
                            insertncTaskAddunion.setNcOrderNumber(Long.valueOf(map.get("NC_ORDER_NUMBER").toString()));
                            insertncTaskAddunion.setDef1(map.get("DEF1").toString());
                            insertncTaskAddunion.setDef2(map.get("DEF2").toString());
                            insertncTaskAddunion.setDef3(map.get("DEF3").toString());
                            insertncTaskAddunion.setDef4(map.get("DEF4").toString());
                            insertncTaskAddunion.setDef5(" ");
                            iNcTaskAddunion.insert(insertncTaskAddunion);
                        }
                        logger.info("结束组装nc_task_addunion...");
                    }catch(Exception e){
                        logger.error("组装nc_task_addunion出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_testlist_comp...");
                        executeSql = getExecuteSql("testlist_nc_testlist_comp",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            insertncTestListComp.setPkTestlistComp(map.get("PK_TESTLIST_COMP").toString());
                            insertncTestListComp.setPkUnitsType(map.get("PK_UNITS_TYPE").toString());
                            insertncTestListComp.setPkListTable(map.get("PK_LIST_TABLE").toString());
                            insertncTestListComp.setNcTestcompCode(map.get("NC_TESTCOMP_CODE").toString());
                            insertncTestListComp.setNcTestcompName(map.get("NC_TESTCOMP_NAME").toString());
                            insertncTestListComp.setNcTestlistName(map.get("NC_TESTLIST_NAME").toString());
                            insertncTestListComp.setNcAnalysisName(map.get("NC_ANALYSIS_NAME").toString());
                            insertncTestListComp.setNcTlcComponent(map.get("NC_TLC_COMPONENT").toString());
                            insertncTestListComp.setAnalysisCount(map.get("ANALYSIS_COUNT").toString());
                            insertncTestListComp.setOrderNumber(map.get("ORDER_NUMBER").toString());
                            insertncTestListComp.setResultOrderNo(map.get("RESULT_ORDER_NO").toString());
                            insertncTestListComp.setUnits(map.get("UNITS").toString());
                            insertncTestListComp.setRound(map.get("ROUND").toString());
                            insertncTestListComp.setPlaces(Long.valueOf(map.get("PLACES").toString()));
                            insertncTestListComp.setReplicateCount(Long.valueOf(map.get("REPLICATE_COUNT").toString()));
                            insertncTestListComp.setMinLimit(BigDecimal.valueOf(Long.valueOf(map.get("MIN_LIMIT").toString())));
                            insertncTestListComp.setMaxLimit(BigDecimal.valueOf(Long.valueOf(map.get("MAX_LIMIT").toString())));
                            insertncTestListComp.setReportable(map.get("REPORTABLE").toString());
                            insertncTestListComp.setOptional(map.get("OPTIONAL").toString());
                            insertncTestListComp.setDisplayed(map.get("DISPLAYED").toString());
                            insertncTestListComp.setFactorValues(map.get("FACTOR_VALUES").toString());
                            insertncTestListComp.setAnalysisVersion(Long.valueOf(map.get("ANALYSIS_VERSION").toString()));
                            insertncTestListComp.setcDefaultValue(map.get("C_DEFAULT_VALUE").toString());
                            insertncTestListComp.setcEnDefaultValue(map.get("C_EN_DEFAULT_VALUE").toString());
                            insertncTestListComp.setListKey(map.get("LIST_KEY").toString());
                            insertncTestListComp.setcDefaultDbFile(Long.valueOf(map.get("C_DEFAULT_DB_FILE").toString()));
                            iNcTestlistCompService.insert(insertncTestListComp);
                        }
                        logger.info("结束组装nc_testlist_comp...");
                    }catch(Exception e){
                        logger.error("组装nc_testlist_comp出错：{}",e.getStackTrace());
                    }


                    try{
                        logger.info("开始组装nc_test_after...");
                        executeSql = getExecuteSql("testlist_nc_test_after",product);
                        List<Map<String,Object>> list =  customerSqlService.selectList(executeSql);
                        for (Map<String,Object> map : list){
                            insertncTestAfter.setPkTestAfter(map.get("PK_TEST_AFTER").toString());
                            insertncTestAfter.setPkResultType(map.get("PK_RESULT_TYPE").toString());
                            insertncTestAfter.setPkUnitsType(map.get("PK_UNITS_TYPE").toString());
                            insertncTestAfter.setTestAfterCode(map.get("TEST_AFTER_CODE").toString());
                            insertncTestAfter.setTestAfterName(map.get("TEST_AFTER_NAME").toString());
                            insertncTestAfter.setNcEnstard(map.get("NC_ENSTARD").toString());
                            insertncTestAfter.setNcEntry(Long.valueOf(map.get("NC_ENTRY").toString()));
                            insertncTestAfter.setNcAnalysisName(map.get("NC_ANALYSIS_NAME").toString());
                            insertncTestAfter.setNcAnalysisVersion(Long.valueOf(map.get("NC_ANALYSIS_VERSION").toString()));
                            insertncTestAfter.setNcAnalysisType(map.get("NC_ANALYSIS_TYPE").toString());
                            insertncTestAfter.setNcSpecRule(map.get("NC_SPEC_RULE").toString());
                            insertncTestAfter.setNcMinValue(map.get("NC_MIN_VALUE").toString());
                            insertncTestAfter.setNcMaxValue(map.get("NC_MAX_VALUE").toString());
                            insertncTestAfter.setNcTextValue(map.get("NC_TEXT_VALUE").toString());
                            insertncTestAfter.setNcStage(map.get("NC_STAGE").toString());
                            insertncTestAfter.setNcSamplePoint(map.get("NC_SAMPLE_POINT").toString());
                            insertncTestAfter.setNcContactType(map.get("NC_CONTACT_TYPE").toString());
                            insertncTestAfter.setNcCoilType(map.get("NC_COIL_TYPE").toString());
                            insertncTestAfter.setNcCoilCurrent(map.get("NC_COIL_CURRENT").toString());
                            insertncTestAfter.setDef1(map.get("DEF1").toString());
                            insertncTestAfter.setDef2(map.get("DEF2").toString());
                            insertncTestAfter.setDef3(map.get("DEF3").toString());
                            insertncTestAfter.setDef4(map.get("DEF4").toString());
                            insertncTestAfter.setDef5(map.get("DEF5").toString());
                            iNcTestAfterService.insert(insertncTestAfter);
                        }
                        logger.info("结束组装nc_test_after...");
                    }catch(Exception e){
                        logger.error("组装nc_test_after出错：{}",e.getStackTrace());
                    }

                    /*try {
                        logger.info("开始组装nc_prod_list...");
                        executeSql = getExecuteSql("testlist_nc_prod_list",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_prod_list...");
                    }catch (Exception e){
                        logger.error("更新nc_prod_list表时出现异常：{}",e.getStackTrace());
                    }
                    try{
                        logger.info("开始组装nc_test_list...");
                        executeSql = getExecuteSql("testlist_nc_test_list",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_test_list...");
                    }catch(Exception e){
                        logger.error("更新nc_test_list表时出现异常：{}",e.getStackTrace());
                    }
                    try{
                        logger.info("开始组装nc_basprod_name...");
                        executeSql = getExecuteSql("testlist_nc_basprod_name",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_basprod_name...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_name出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_basprod_type...");
                        executeSql = getExecuteSql("testlist_nc_basprod_type",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_basprod_type...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_type出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装NC_BASEN_TYPE...");
                        executeSql = getExecuteSql("testlist_nc_basen_type",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装NC_BASEN_TYPE...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_type出错：{}",e.getStackTrace());
                    }
                    -----------------------
                    try{
                        logger.info("开始组装nc_basprod_point...");
                        executeSql = getExecuteSql("testlist_nc_basprod_point",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_basprod_point...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_point出错：{}",e.getStackTrace());
                    }
                    ---------------------------
                    try{
                        logger.info("开始组装nc_basprod_struct...");
                        executeSql = getExecuteSql("testlist_nc_basprod_struct",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_basprod_struct...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_struct出错：{}",e.getStackTrace());
                    }
                    ------------------------------------------------
                    try{
                        logger.info("开始组装NC_BASPROD_CONTACT...");
                        executeSql = getExecuteSql("test_nc_basprod_contact",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装NC_BASPROD_CONTACT...");
                    }catch(Exception e){
                        logger.error("组装NC_BASPROD_CONTACT出错：{}",e.getStackTrace());
                    }
                    --------------------------------------------------------
                    try{
                        logger.info("开始组装nc_basprod_temp...");
                        executeSql = getExecuteSql("testlist_nc_basprod_temp",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_basprod_temp...");
                    }catch(Exception e){
                        logger.error("组装nc_basprod_temp出错：{}",e.getStackTrace());
                    }
                    --------------------------------------------------
                    try{
                        logger.info("开始组装nc_sample_info...");
                        executeSql = getExecuteSql("testlist_nc_sample_info",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_sample_info...");
                    }catch(Exception e){
                        logger.error("组装nc_sample_info出错：{}",e.getStackTrace());
                    }
                    ----------------------------------------------------------
                    try{
                        logger.info("开始组装nc_test_init...");
                        executeSql = getExecuteSql("testlist_nc_test_init",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_test_init...");
                    }catch(Exception e){
                        logger.error("组装nc_test_init出错：{}",e.getStackTrace());
                    }
                    -------------------------------------------
                    try{
                        logger.info("开始组装nc_task_addunion...");
                        executeSql = getExecuteSql("testlist_nc_task_addunion",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_task_addunion...");
                    }catch(Exception e){
                        logger.error("组装nc_task_addunion出错：{}",e.getStackTrace());
                    }
                    ----------------------------------------------------------------
                    try{
                        logger.info("开始组装nc_testlist_comp...");
                        executeSql = getExecuteSql("testlist_nc_testlist_comp",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_testlist_comp...");
                    }catch(Exception e){
                        logger.error("组装nc_testlist_comp出错：{}",e.getStackTrace());
                    }

                    try{
                        logger.info("开始组装nc_test_after...");
                        executeSql = getExecuteSql("testlist_nc_test_after",product);
                        customerSqlService.insert(executeSql);
                        logger.info("结束组装nc_test_after...");
                    }catch(Exception e){
                        logger.error("组装nc_test_after出错：{}",e.getStackTrace());
                    }
                     */
                    /**
                     *      sheny 2018.09.23
                     *      version : init
                     *      Func : Sync from another Database(Asyn)
                     */
                    logger.info("product:{},version:{},更新完成...",product.getName(),product.getVersion());
                }
            }
            logger.info("testlist同步正常结束......");
        }

    }


    /**
     * 清除nc中重复的条件、试验前后参数
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    //@Scheduled(cron = "0 0 4 * * ?")
    public void clearDuplicationData() throws Exception {
        List<String> productsListVesionList = new ArrayList<>();
        int productCount = 0;
        int delInitCount = 0;
        int delAfterCount = 0;
        //获取所有在用product
        List<Product> productsList = new ArrayList<>();
        try{
            productsList = iProductService.getAllProduct();
        }catch (Exception e){
            logger.error("获取全部product时出错...");
        }
        //开始判断获取的每一个product试验前是不是版本唯一
        for (Product p :productsList){
            productCount = Integer.valueOf(customerSqlService.selectOne("select count(1) from nc_prod_list where name = '" + p.getName() + "'"));
            if (productCount > 1){
                //如果大于1个版本就开删
                for (int i = 1 ; i < productCount ; i++){
                    try{
                        delInitCount = customerSqlService.delete("delete from nc_test_init where trim(nc_enstard) = '" + p.getName().trim() + "' and trim(nc_analysis_version) = " + i);
                        logger.info("product:{}，version:{}，试验前共计删除{}行",p.getName(),i,delInitCount);
                        delAfterCount = customerSqlService.delete("delete from nc_test_after where trim(nc_enstard) = '" + p.getName().trim() + "' and trim(nc_analysis_version) = " + i);
                        logger.info("product:{}，version:{}，试验后共计删除{}行",p.getName(),i,delAfterCount);
                    }catch (Exception e){
                        throw new Exception("删除product试验前后时出错"+e.getStackTrace());
                    }
                }
            }
        }
        logger.info("清除重复项完成");

    }


    public String getExecuteSql(String modules,Product product){
        String sql = "";
        try{
            logger.info("开始获取模块语句,module:{}..............",modules);
            sql = customerSqlService.selectOne("select sql_text from sql_records where sql_code = '" + modules + "'");
            //语句替换
            /**
             * sheny : product.name
             * why   : product.version
             * shenycode : product.code
             * shenytestlist : product.testlist
             */
            sql = sql.replace("sheny",product.getName());
            sql = sql.replace("why",String.valueOf(product.getVersion()));
            sql = sql.replace("ccode",product.getCode());
            sql = sql.replace("ttestlist",product.getTestList());
            logger.info("结束获取模块语句,module:{}..............",modules);
        }catch (Exception e){
            logger.error("获取语句出错,modules:{},cause:{}",modules,e.getStackTrace());
        }
        return sql;
    }


}
