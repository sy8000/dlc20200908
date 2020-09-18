package cn.besbing.Service.Impl;

import cn.besbing.CommonUtils.Utils.GetNcPrimaryKey;
import cn.besbing.Entities.*;
import cn.besbing.Service.IWriteBackToLims;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class IWriteBackToLimsImpl implements IWriteBackToLims {

    @Autowired(required = false)
    IProjectServiceImpl iProjectService;

    @Autowired(required = false)
    ICprojLoginSampleServiceImpl iCprojLoginSampleService;

    @Autowired
    ICprojTaskServiceImpl iCprojTaskService;

    @Autowired(required = false)
    ICommissionBServiceImpl iCommissionBService;

    @Autowired(required = false)
    IQcCommissionHServiceImpl iQcCommissionHService;

    @Autowired(required = false)
    CustomerSqlServiceImpl customerSqlService;

    @Autowired(required = false)
    ITaskBServiceImpl iTaskBService;

    GetNcPrimaryKey ncPrimaryKey = null;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    Project templateProject = null;
    CProjLoginSample templateCProjLoginSample = null;

    Logger logger = LoggerFactory.getLogger(this.getClass());


    public synchronized String WriteBackToLims(String projectBillNumber){

        ncPrimaryKey = new GetNcPrimaryKey();
        String returnMsg = "";
        try{
            /**
             * 首先获取模板project，然后调用数据清洗方法，返回清洗完成的project，执行insert
             */
            //templateProject = iProjectService.getLimsExampleProject();
            //project 表 数据准备
            Project project = projectETL(projectBillNumber);
            //CProjLoginSample    list   准备
            CProjLoginSample cProjLoginSample = iCprojLoginSampleService.getLimsExampleCProjLoginSample();
            List<CProjLoginSample> cProjLoginSampleList = cProjLoginSampleETL(projectBillNumber,cProjLoginSample);
            //任务表回写准备        list    准备
            CProjTask cProjTask = iCprojTaskService.getLimsExampleTask();
            List<CProjTask> cProjTaskList = cProjTaskETL(projectBillNumber,cProjTask);
            //判断tasksample有多少个，如果有同样的任务，则多增一条sample记录，否则为一条，为了区分result
            /*List
            for (){

            }*/
            //cprojtask关联的sample
            List<Sample> taskSampleList = new ArrayList<>();


            //cprojtask关联的test

            //任务条件result

            //样品相关的sample

            //样品相关联的测试test

            //(样品相关result)

            //试验前后最后再做



            //准备全部完成，开始回写，首先要把各表的主键申请出来
            if (project != null){
                //写入project

            }else {
                return "NC委托单组装失败";
            }
        }catch (Exception e){
            return e.getStackTrace().toString();
        }
        return returnMsg;
    }

    private List<CProjTask> cProjTaskETL(String projectBillNumber, CProjTask cProjTaskTemplate) throws ParseException {
        ncPrimaryKey = new GetNcPrimaryKey();
        List<String> qcTaskBPrimaryKeys = customerSqlService.selectAsList("select pk_task_b from qc_task_b where dr = 0 and taskcode like '"+ projectBillNumber +"%' ");
        List<QcTaskB> qcTaskBList = iTaskBService.getTaskB(qcTaskBPrimaryKeys);
        List<CProjTask> cProjTaskList = new ArrayList<CProjTask>();
        Map<String,Object> analysisMap = new HashMap<>();
        for (QcTaskB qcTaskB : qcTaskBList){
            CProjTask cProjTask = cProjTaskTemplate;
            cProjTask.setProject(projectBillNumber);
            //主键放空
            //cProjTask.setSeqNum();
            cProjTask.setOrderNumber(qcTaskB.getRunorder());
            cProjTask.setAnalysis(qcTaskB.getPkTestresultname());
            cProjTask.setChangedOn(sdf.parse(qcTaskB.getDr().toString()));
            //先写死刘旭峰
            cProjTask.setChangedBy("1001295");
            cProjTask.setTaskId(qcTaskB.getTaskcode());
            //任务testnumber先不写
            //cProjTask.setTestNumber();
            cProjTask.setPlanTestTime(Long.valueOf(ncPrimaryKey.getPlanTestTime(qcTaskB.getPkTaskB())));
            //获取当前分析条件的计费信息
            analysisMap = ncPrimaryKey.getAnalysisFee(qcTaskB.getStandardclause(),Integer.valueOf(qcTaskB.getSamplequantity().toString()),Integer.valueOf(cProjTask.getPlanTestTime().toString()));
            cProjTask.setMaxNumBatch(Long.valueOf(analysisMap.get("c_max_num_batch").toString()));
            cProjTask.setBaseFee(BigDecimal.valueOf(Double.valueOf(analysisMap.get("c_base_fee").toString())));
            cProjTask.setTestFee(BigDecimal.valueOf(Double.valueOf(analysisMap.get("test_fee").toString())));
            cProjTask.setQuotes(BigDecimal.valueOf(Double.valueOf(analysisMap.get("total_charge").toString())));
            cProjTask.setTaskReportedName(qcTaskB.getTestitem());
            cProjTask.setAssignedSample(qcTaskB.getSampleallocationsource());
            cProjTask.setAssignedSampleDisplay(qcTaskB.getSampleallocation());
            cProjTask.setAssignedSampleQuantity(Long.valueOf(qcTaskB.getSamplequantity().toString()));
            //从submit的人开始没写，因为从nc里读了
            //cProjTask
            cProjTaskList.add(cProjTask);
        }
        return cProjTaskList;
    }

    private List<CProjLoginSample> cProjLoginSampleETL(String projectBillNumber, CProjLoginSample cProjLoginSampleTemplate) {
        ncPrimaryKey = new GetNcPrimaryKey();
        List<CProjLoginSample> loginSampleList = new ArrayList<CProjLoginSample>();
        List<QcCommissionB> list = new ArrayList<QcCommissionB>();
        String commissionHPrimaryKey = customerSqlService.selectOne("select h.pk_commission_h from qc_commission_h h where h.billno = '' and dr = 0");
        list = iCommissionBService.getCommissionBodyListByProject(commissionHPrimaryKey);
        for (QcCommissionB qcCommissionB : list){
            CProjLoginSample cProjLoginSample = cProjLoginSampleTemplate;
            //先不给主键
            //cProjLoginSample.setSeqNum();
            cProjLoginSample.setProject(ncPrimaryKey.transNullToNone(projectBillNumber));
            cProjLoginSample.setProductSeries(ncPrimaryKey.getproductSerial(qcCommissionB.getPkProductserial()));
            cProjLoginSample.setProductStandard(ncPrimaryKey.getproductStandard(qcCommissionB.getPkEnterprisestandard()));
            cProjLoginSample.setProdname(ncPrimaryKey.transNullToNone(qcCommissionB.getTypeno()));
            cProjLoginSample.setProductionSpec(ncPrimaryKey.getproductSpec(qcCommissionB.getPkProductspec()));
            cProjLoginSample.setStructureType(ncPrimaryKey.getStruct(qcCommissionB.getPkStructuretype()));
            cProjLoginSample.setContactType(ncPrimaryKey.transNullToNone(qcCommissionB.getContacttype()));
            cProjLoginSample.setSampleGroup(ncPrimaryKey.getSampleGroup(qcCommissionB.getPkSamplegroup()));
            cProjLoginSample.setSampleQuantity(Long.valueOf(ncPrimaryKey.transNullToNone(qcCommissionB.getQuantity().toString())));
            cProjLoginSample.setManufacturer(ncPrimaryKey.transNullToNone(qcCommissionB.getManufacturer()));
            cProjLoginSample.setOtherReq(ncPrimaryKey.transNullToNone(qcCommissionB.getOtherinfo()));
            cProjLoginSample.setProductStage(ncPrimaryKey.transNullToNone(qcCommissionB.getProductstage()));
            cProjLoginSample.setContactBrand(ncPrimaryKey.getSampleContactBrand(qcCommissionB.getPkContactbrand()));
            cProjLoginSample.setContactModel(ncPrimaryKey.transNullToNone(qcCommissionB.getContactmodel()));
            loginSampleList.add(cProjLoginSample);
        }
        return loginSampleList;
    }

    private Project projectETL(String projectBillNumber) {
        ncPrimaryKey = new GetNcPrimaryKey();
        Project project = null;
        QcCommissionH qcCommissionH = null;
        try{
            project = iProjectService.getLimsExampleProject();
            qcCommissionH = iQcCommissionHService.selectQMHByPrimary(ncPrimaryKey.getCommissionHPrimaryKey(projectBillNumber));
            project.setClosed("F");
            project.setName(qcCommissionH.getBillno());
            project.setTemplate(ncPrimaryKey.getProjectType(qcCommissionH.getPkCommissiontype()));
            project.setTitle(qcCommissionH.getBillname());
            project.setDescription(qcCommissionH.getProgressneed());
            project.setDateCreated(sdf.parse(qcCommissionH.getCreationtime()));
            project.setDateReceived(sdf.parse(qcCommissionH.getLastmaketime()));
            project.setDateUpdated(sdf.parse(qcCommissionH.getLastmaketime()));
            project.setCustomer(ncPrimaryKey.getCompany(qcCommissionH.getPkOwner()));
            project.setCustomerContact(qcCommissionH.getContract());
            project.setOwner(ncPrimaryKey.getSmuser(qcCommissionH.getCuserid()));
            project.setCreatedBy(ncPrimaryKey.getSmuser(qcCommissionH.getCuserid()));
            project.setNumSamples(Long.valueOf(ncPrimaryKey.getSampleTotal(ncPrimaryKey.getTaskHPrimaryKey(projectBillNumber))));
            project.settSourceCustomer(ncPrimaryKey.getCompany(qcCommissionH.getPkPayer()));
            project.setcPhoneNumber(qcCommissionH.getTeleno());
            project.setcEmailAddress(qcCommissionH.getEmail());
            project.setcProductType(ncPrimaryKey.getProductType(qcCommissionH.getPkMaincategory()));
            project.setcApplyType(ncPrimaryKey.getProjectType(qcCommissionH.getPkCommissiontype()));
            project.setcRetainHandle(ncPrimaryKey.getSampleAfterTest(qcCommissionH.getSampledealtype()));
            project.setcCoaLanguage(ncPrimaryKey.getReportLanguage(qcCommissionH.getReportlang()));
            project.setcCoaFormat(ncPrimaryKey.getReportFormat(qcCommissionH.getReportformat()));
            //开始从c_test_purpose依次赋值
            //测试目的
            project.setcTestPurpose(ncPrimaryKey.transNullToNone(qcCommissionH.getTestaim()));
            //产品属性
            project.setcProductProperty(ncPrimaryKey.transNullToNone(qcCommissionH.getProductproperty()));
            //二级分类
            project.setcProdTypeC1(ncPrimaryKey.getProductTypeSecond(qcCommissionH.getPkSubcategory()));
            //三级分类
            project.setcProdTypeC2(ncPrimaryKey.getProductTypeThird(qcCommissionH.getPkLastcategory()));
            //申请类型
            project.setcApplyType(ncPrimaryKey.transNullToNone(ncPrimaryKey.getProjectType(qcCommissionH.getPkCommissiontype())));
            //认证类型
            project.setcCertificationType(ncPrimaryKey.getCertificationName(qcCommissionH.getCertificationtype()));
            //项目号
            project.setcItemNumber(ncPrimaryKey.transNullToNone(qcCommissionH.getItemnumber()));
            //试验类型
            project.setcIdentificationType(ncPrimaryKey.transNullToNone(qcCommissionH.getIdentificationtype()));
            //客户名称
            project.setcTerminalClient(ncPrimaryKey.transNullToNone(qcCommissionH.getCustomername()));
            //客户类型
            project.setcClientType(ncPrimaryKey.getCustomerType(qcCommissionH.getCustomertype()));
            //测试需求
            project.setcProductRequirement(ncPrimaryKey.getProductRequirement(qcCommissionH.getTestrequirement()));
            //检验性质
            project.setcCheckingProperty(ncPrimaryKey.getCheckingProperty(qcCommissionH.getCheckingproperty()));
            //产线
            project.setcProductLine(ncPrimaryKey.transNullToNone(qcCommissionH.getProductline()));
            //批量
            project.setcBatchNumber(qcCommissionH.getBatchnumber() == null ? null : Long.valueOf(ncPrimaryKey.transNullToNone(String.valueOf(qcCommissionH.getBatchnumber()))));
            //日期
            project.setcProductDate(qcCommissionH.getProductdate() == null ? null : sdf.parse(qcCommissionH.getProductdate()));
            //批号
            project.setcBatchSerial(ncPrimaryKey.transNullToNone(qcCommissionH.getBatchnumber()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return project;
    }

    private int deleteExistProjectAllDataExceptProject(String projectBillNumber){
        int i = -1 ;
        try{
            i = customerSqlService.update("update project set c_nc_to_lims = 'F' where name = '" + projectBillNumber + "' ");
        }catch (Exception e){
            logger.error("删除lims中已存在委托单其它信息出错，具体错误：{}",e.getStackTrace());
            return -2;
        }
        return i;
    }

    private int deleteExistProjectInLims(String projectBillNumber){
        int i = -1 ;
        try {
            iProjectService.deleteProjectByPrimary(projectBillNumber);
        }catch (Exception e){
            logger.error("删除lims中已存在委托单信息出错，具体错误：{}",e.getStackTrace());
            return -2;
        }
        return i;
    }

}
