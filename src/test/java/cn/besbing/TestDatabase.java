package cn.besbing;

import cn.besbing.CommonUtils.MaintainModel.SpringUtil;
import cn.besbing.Cron.AnalysisThread;
import cn.besbing.Entities.*;
import cn.besbing.Service.Impl.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DloadercloudApplication.class)
public class TestDatabase {
    private Logger logger = LoggerFactory.getLogger(AnalysisThread.class);
    //private CustomerSqlServiceImpl customerSqlService = SpringUtil.getBean(CustomerSqlServiceImpl.class);
    @Autowired
    CustomerSqlServiceImpl customerSqlService = new CustomerSqlServiceImpl();
    @Autowired
    INcAnalysisListServiceImpl iNcAnalysisListService;
    //UL60947-4-1-2014_8.2.4-1A
    @Autowired
    NcAnalysisReportnameServiceImpl ncAnalysisReportnameService;

    @Autowired
    DlPermissionServiceImpl dlPermissionService;

    @Autowired
    IComponentServiceImpl iComponentService;


    @Test
    public void testComponent(){
        ComponentDefKey componentDefKey = new ComponentDefKey();
        componentDefKey.setAnalysis("耐焊接热_IEC618-7");
        componentDefKey.setVersion(Long.valueOf(2));
        try{
            List<Component> components = iComponentService.selectByTS(componentDefKey);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    @Test
    public void testImpl(){
        List<DlPermission> dlPermission = dlPermissionService.findPermissionByRoleId("ABCDZXCVBNMAADFERTTY");
        logger.info(String.valueOf(dlPermission.size()));
    }





    @Test
    public void testVo(){

/*
        NcProdListKey ncProdListKey = new NcProdListKey();
        ncProdListKey.setName("QFVF4024-2020");
        ncProdListKey.setVersion(Long.valueOf(1));

        String sql = "select substr(SYS_GUID(),1,20) pk ,pu.name,pu.version,RANK() over(order by pu.name asc) nccode, \n" +
                "pu.name ncname,(case  pu.removed when 'F' then 1 else 0 end) enableuse,'auto','','','','',pu.description,pu.code \n" +
                "from product pu where pu.name ='QFVF4024-2020' and pu.version = 1";

        List<Map<String, Object>> list = customerSqlService.selectList(sql);
        for (int i=0;i<list.size();i++){
            logger.info("-----------------{}-------------------------",list.get(i).get("PK"));
        }*/


        AnalysisThread analysisThread = new AnalysisThread();
        NcAnalysisReportname ncAnalysisReportname = new NcAnalysisReportname();
        ncAnalysisReportname.setPkAnalysisReportname("sheny33445566");
        ncAnalysisReportname.setIsenable(BigDecimal.valueOf(1));
        ncAnalysisReportname.setNcReportnameCode("23");
        ncAnalysisReportname.setNcReportnameName("abcdefg");
        ncAnalysisReportname.setDef1("");
        ncAnalysisReportname.setDef2("");
        ncAnalysisReportname.setDef3("");
        ncAnalysisReportname.setDef4("sheny");
        ncAnalysisReportname.setDef5("");
        try{
            //执行分析添加
            //analysisThread.onlyAddAnalysisThread();
            //执行testlist
            //analysisThread.addTestListThread();
            //logger.info("执行完毕");
            ncAnalysisReportnameService.insertAndGetPrimary(ncAnalysisReportname);
            logger.info("=============={}==========================",ncAnalysisReportname.getDef4());

        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }

        /*NcAnalysisList ncAnalysisList = new NcAnalysisList();
        //NcAnalysisList ncAnalysisList1 = new NcAnalysisList();
        ncAnalysisList.setName("UL60947-4-1-2014_8.2.4-1A");
        ncAnalysisList.setVersion(Long.valueOf(1));
        try{
            ncAnalysisList = iNcAnalysisListService.selectByAnalysisKey(ncAnalysisList);
            logger.info("======================{}+++++++++=========",ncAnalysisList.getNcAnalysisCode());
        }catch(Exception e){
            e.printStackTrace();
        }*/
        /*String executeSql = "";
        Product product = new Product();
        NcProdList ncProdList = null;
        product.setName("QFVF4284-2014");
        product.setVersion(Long.valueOf(1));
        product.setCode("Q/FVF 4284-2014");
        product.setTestList("QFVF4284-2017_HF8654");
        executeSql = getExecuteSql("testlist_nc_prod_list",product);
        List<?> list = new ArrayList<>();
        //ncProdList = (NcProdList)customerSqlService.selectList(executeSql);
        list = customerSqlService.selectList(executeSql);
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));*/


    }


    public String getExecuteSql(String modules, Product product){
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
            sql = sql.replace("shenycode",product.getCode());
            sql = sql.replace("shenytestlist",product.getTestList());
            logger.info("结束获取模块语句,module:{}..............",modules);
        }catch (Exception e){
            logger.error("获取语句出错,modules:{},cause:{}",modules,e.getStackTrace());
        }
        return sql;
    }


}
