package cn.besbing;

import cn.besbing.CommonUtils.MaintainModel.SpringUtil;
import cn.besbing.CommonUtils.Utils.MailDTO;
import cn.besbing.Conctrollers.DataLoaderMailController;
import cn.besbing.Cron.AnalysisThread;
import cn.besbing.Dao.SmUserMapper;
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
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.mail.Address;
import javax.mail.SendFailedException;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.*;

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


    @Autowired
    MailServiceImpl mailService;

    @Autowired
    SmuserServiceImpl  smuserService;

    @Autowired
    IMergeExcelServiceImpl iMergeExcelService;


    @Test
    public void testDownload() throws Exception {
        iMergeExcelService.clearSpireCompressLogoFlag("D:\\resignreport\\finalresign\\mutile1600249279698.pdf","D:\\resignreport\\finalresign\\1140.pdf");
    }

    private static Set<String> getInvalidAddress(SendFailedException e){
        Set<String> mails = new HashSet<>();
        for(Address address: e.getInvalidAddresses()){
            mails.add(address.toString().trim());
        }
        return mails;
    }


    @Test
    public void sendMails() throws InterruptedException {
        /*List<Map<String,Object>> list = customerSqlService.selectList(" select nvl(trim(s.user_code),'-') code from sm_user s where s.islocked = 'N' and dr = 0 and user_code is not null ");
        List<String> tArr = new ArrayList<>();
        for (Map<String,Object> map : list){
            tArr.add(map.get("code").toString());
        }
        String mailAddress[] = (String[]) tArr.toArray();*/
        List<SmUser> list = smuserService.selectByExample(null);
        List<String> codeList = new ArrayList<>();
        for (SmUser s : list){
            codeList.add(s.getUserCode() + "@hongfa.cn");
        }
        Object codeArr[] = codeList.toArray();
        MailDTO mailDTO = new MailDTO();
        mailDTO.setSubject("关于检测中心LIMS WEB软件使用满意度调查");
        //mailDTO.setToUsers(new String[]{"1000514@hongfa.cn","1002437@hongfa.cn"});
        //Object[] objectArray = { "A", "B", "C" };
        String stringArray[] = Arrays.stream(codeArr).toArray(String[]::new);
        mailDTO.setToUsers(stringArray);
        for (int i = 0 ; i< stringArray.length;i++){
            mailDTO.setToUsers(new String[]{stringArray[i]});
            logger.info("------------{}:{}",i,stringArray[i]);
            //.sleep(2000);
            mailService.sendImgMail(mailDTO);
        }
        //mailService.sendImgMail(mailDTO);
    }


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
