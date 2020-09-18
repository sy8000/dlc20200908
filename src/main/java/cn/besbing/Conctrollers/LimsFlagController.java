package cn.besbing.Conctrollers;

import cn.besbing.CommonUtils.MaintainModel.PageDataResult;
import cn.besbing.CommonUtils.MaintainModel.SearchDTO;
import cn.besbing.CommonUtils.MaintainModel.UpdateLimsBillStatus;
import cn.besbing.Entities.*;
import cn.besbing.Service.Impl.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/lims")
public class LimsFlagController {

    Logger logger = LoggerFactory.getLogger(LimsFlagController.class);


    @Autowired
    CustomerSqlServiceImpl customerSqlService;

    @Autowired
    ResultServiceImpl resultService;

    @Autowired
    IComponentServiceImpl iComponentService;

    @Autowired
    TaskInfoServiceImpl taskInfoService;

    @Autowired
    ICprojTaskServiceImpl cprojTaskService;

    @Autowired
    IProjectServiceImpl projectService;

    @Autowired
    IQcCommissionHServiceImpl qcCommissionHService;

    @Autowired
    IMergeExcelServiceImpl mergeExcelService;

    @Autowired
    DownloadServiceImpl downloadService;

    //@Transactional(rollbackFor = Exception.class)
    @RequestMapping(value = "/updateToSign",method = RequestMethod.POST)
    @ResponseBody
    public String updateToSign(@RequestBody String taskIds){
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        UpdateLimsBillStatus updateLimsBillStatus = new UpdateLimsBillStatus();
        List<String> projList = new ArrayList<String>();
        for (int i=0;i<jsonArray.size();i++){
            jsonObject = jsonArray.getJSONObject(i);
            projList.add(jsonObject.get("project").toString());
        }
        return String.valueOf(updateLimsBillStatus.moveToSampleMgr(projList));
    }

    /**
     * 计划排程跳转
     * @param taskIds
     * @return
     */
    @RequestMapping(value = "/updateToPlan",method = RequestMethod.POST)
    @ResponseBody
    public String updateToPlan(@RequestBody String taskIds){
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        UpdateLimsBillStatus updateLimsBillStatus = new UpdateLimsBillStatus();
        List<String> projList = new ArrayList<String>();
        for (int i=0;i<jsonArray.size();i++){
            jsonObject = jsonArray.getJSONObject(i);
            projList.add(jsonObject.get("project").toString());
        }
        return String.valueOf(updateLimsBillStatus.moveToPlan(projList));
    }

    /**
     * 任务分配跳转
     * @param taskIds
     * @return
     */
    @RequestMapping(value = "/updateToBistribution",method = RequestMethod.POST)
    @ResponseBody
    public String updateToBistribution(@RequestBody String taskIds){
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        UpdateLimsBillStatus updateLimsBillStatus = new UpdateLimsBillStatus();
        List<String> taskidList = new ArrayList<String>();
        for (int i=0;i<jsonArray.size();i++){
            jsonObject = jsonArray.getJSONObject(i);
            taskidList.add(jsonObject.get("taskId").toString());
        }
        return String.valueOf(updateLimsBillStatus.moveToLimsStempGenaral(taskidList,"distribution"));
    }


    /**
     * 试验中跳转
     * @param taskIds
     * @return
     */
    @RequestMapping(value = "/updateToTesting",method = RequestMethod.POST)
    @ResponseBody
    public String updateToTesting(@RequestBody String taskIds){
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        UpdateLimsBillStatus updateLimsBillStatus = new UpdateLimsBillStatus();
        List<String> taskidList = new ArrayList<String>();
        for (int i=0;i<jsonArray.size();i++){
            jsonObject = jsonArray.getJSONObject(i);
            taskidList.add(jsonObject.get("taskId").toString());
        }
        return String.valueOf(updateLimsBillStatus.moveToLimsStempGenaral(taskidList,"testing"));
    }

    /**
     * 工程师跳转
     * @param taskIds
     * @return
     */
    @RequestMapping(value = "/updateToEngineer",method = RequestMethod.POST)
    @ResponseBody
    public String updateToEngineer(@RequestBody String taskIds){
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        UpdateLimsBillStatus updateLimsBillStatus = new UpdateLimsBillStatus();
        List<String> taskidList = new ArrayList<String>();
        for (int i=0;i<jsonArray.size();i++){
            jsonObject = jsonArray.getJSONObject(i);
            taskidList.add(jsonObject.get("taskId").toString());
        }
        return String.valueOf(updateLimsBillStatus.moveToLimsStempGenaral(taskidList,"engineer"));
    }

    /**
     * 签发跳转
     * @param taskIds
     * @return
     */
    @RequestMapping(value = "/updateToReport",method = RequestMethod.POST)
    @ResponseBody
    public String updateToReport(@RequestBody String taskIds){
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        UpdateLimsBillStatus updateLimsBillStatus = new UpdateLimsBillStatus();
        List<String> taskidList = new ArrayList<String>();
        for (int i=0;i<jsonArray.size();i++){
            jsonObject = jsonArray.getJSONObject(i);
            taskidList.add(jsonObject.get("taskId").toString());
        }
        return String.valueOf(updateLimsBillStatus.moveToLimsStempGenaral(taskidList,"report"));
    }

    /**
     * 任务取消跳转
     * @param taskIds
     * @return
     * 逻辑描述：单任务取消，后续标志位不写，任务就地刷成标志位'F'状态（不更新到nc），任务表的description字段回写‘任务取消’字样
     */
    @RequestMapping(value = "/updateToTaskend",method = RequestMethod.POST)
    @ResponseBody
    public String updateToTaskend(@RequestBody String taskIds){
        int flag = 0;
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        for (int i=0;i<jsonArray.size();i++){
            jsonObject = jsonArray.getJSONObject(i);
            flag += customerSqlService.update("update c_proj_task set status = 'F',description = description || ' 任务取消' where task_id = '"+ jsonObject.get("taskId").toString() +"' ");
            customerSqlService.update("update c_arrangement ca set ca.status = 'F' where ca.task_id = '"+ jsonObject.get("taskId").toString() +"'");
            customerSqlService.update("update c_proj_task cpt set cpt.c_address = '任务取消:' || to_char(sysdate,'yyyy-mm-dd') where cpt.task_id = '"+ jsonObject.get("taskId").toString() + "'");
        }
        return String.valueOf(flag);
    }


    /**
     * 任务终止跳转
     * @param taskIds
     * @return
     * 逻辑描述：单任务取消，任务就地将当前日期刷满后续标志位，单据刷成'已签发'状态，cpt.c_address回写字样'任务中止'
     */
    @RequestMapping(value = "/updateToTaskcancel",method = RequestMethod.POST)
    @ResponseBody
    public String updateToTaskcancel(@RequestBody String taskIds){
        int flag = 0;
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        for (int i=0;i<jsonArray.size();i++){
            jsonObject = jsonArray.getJSONObject(i);
            flag += customerSqlService.update("update c_proj_task set description = description || ' 任务终止' where task_id = '"+ jsonObject.get("taskId").toString() +"' ");
            customerSqlService.update("update c_arrangement ca set ca.status = 'F' where ca.task_id = '"+ jsonObject.get("taskId").toString() +"'");
            customerSqlService.update("update c_proj_task cpt set cpt.c_address = '任务中止:' || to_char(sysdate,'yyyy-mm-dd') where cpt.task_id = '"+ jsonObject.get("taskId").toString() + "'");
        }
        return String.valueOf(flag);
    }

    /**
     * 任务修正，对result表中机械耐久性的结果进行修正
     * @param taskIds
     * @return
     */
    @RequestMapping(value = "/resultModify",method = RequestMethod.POST)
    @ResponseBody
    public String resultModify(@RequestBody String taskIds){
        int flag = 0;
        int resultNo = getResultNumber(10000000);
        String []lArr = null;
        String sql = "select distinct t.sample_number || ',' || t.test_number || ',' ||t.analysis from test t where " +
                " t.ts is not null and t.c_test_type = '测试结果' and t.c_task_id = 'sheny' " ;
        String delsql = "delete from result r " +
                " where r.ts is not null and r.analysis not like '%初始%' and r.analysis not like '%试验后%' and r.test_number in " +
                " (select t.test_number from test t where t.ts is not null and t.c_test_type = '测试结果' " +
                " and t.c_task_id = 'sheny')";

        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        Result resultTemplate = resultService.getLimsExampleResult();
        String rightAnalysisSql = "select distinct t.analysis from test t where t.c_task_id = 'sheny'";
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Date d = sdf.format(new Date().getTime());
        try{
            for (int i=0;i<jsonArray.size();i++){
                jsonObject = jsonArray.getJSONObject(i);
                rightAnalysisSql = rightAnalysisSql.replace("sheny",jsonObject.get("taskId").toString());
                String rightAnalysis = customerSqlService.selectOne(rightAnalysisSql);
                sql = sql.replace("sheny",jsonObject.get("taskId").toString());
                List<String> resultCondition = customerSqlService.selectAsList(sql);
                /**
                 * 正式测试时要放开，删除原有result
                 */
                customerSqlService.delete(delsql.replace("sheny",jsonObject.get("taskId").toString()));
                for (String l : resultCondition){
                    lArr = l.split(",");
                    String versionStr = customerSqlService.selectOne("select max(version) from analysis where name = '" + rightAnalysis + "'");
                    String reportedNameStr = customerSqlService.selectOne("select reported_name from analysis where name = '" + rightAnalysis + "' and version = " + versionStr);
                    /*Component component = new Component();
                    component.setVersion(Long.valueOf(versionStr));
                    component.setAnalysis(rightAnalysis);*/
                    ComponentDefKey componentDefKey = new ComponentDefKey();
                    componentDefKey.setVersion(Long.valueOf(versionStr));
                    componentDefKey.setAnalysis(rightAnalysis);
                    List<Component> listComponent = iComponentService.selectByTS(componentDefKey);
                    for (Component c : listComponent){
                        Result result = resultTemplate;
                        result.setSampleNumber(Long.valueOf(lArr[0]));
                        result.setTestNumber(Long.valueOf(lArr[1]));
                        //修正bug防止每次从头开始
                        resultNo = getResultNumber(resultNo);
                        result.setResultNumber(Long.valueOf(resultNo));
                        result.setOrderNumber(c.getOrderNumber());
                        result.setAnalysis(rightAnalysis);
                        result.setName(c.getName());
                        result.setReportedName(c.getName());
                        result.setResultType(c.getResultType());
                        result.setMinimum(c.getMinimum());
                        result.setMaximum(c.getMaximum());
                        result.setUnits(c.getUnits());
                        result.setRound(c.getRound());
                        result.setPlaces(c.getPlaces());
                        result.setUsesInstrument(c.getUsesInstrument());
                        result.setUsesCodes(c.getUsesCodes());
                        result.setAutoCalc(c.getAutoCalc());
                        result.setListKey(c.getListKey());
                        result.setAllowCancel(c.getAllowCancel());
                        result.setReportable(c.getReportable());
                        result.setOptional(c.getOptional());
                        result.setChangedOn(new Date());
                        result.setHasAttributes(c.getHasAttributes());
                        result.setDisplayed(c.getDisplayed());
                        result.setPlaces2(c.getPlaces2());
                        result.settShortName(c.gettShortName());

                        flag += resultService.insertResult(result);
                        logger.info("数据修正：{}",result.toString());
                    }

                }
            }
            flag = 1;
        }catch (Exception e){
            e.printStackTrace();
            flag = -1;
        }

        return String.valueOf(flag);
    }


    public int getResultNumber(int resultNumber){
        //先查到空的起始result_number
        String rs = null;
        do{
            resultNumber++;
            rs = customerSqlService.selectOne("select 1 from result where result_number = " + resultNumber);
        }while (rs != null);

        return resultNumber;
    }


    @RequestMapping(value = "/singlewhole",method = RequestMethod.POST)
    @ResponseBody
    public String updateWholeSingle(@RequestBody String taskIds){
        String flag = "-1";
        String singlePk = "A1A3C72C33E77947E053";
        String wholePk = "A1A3C72C33E67947E053";
        String single = "单项";
        String whole = "成套";
        //int num = 1;
        List<String> projectList = new ArrayList<>();
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        List<String> list = new ArrayList();
        Project project = null;
        QcCommissionH qcCommissionH = null;
        Project projectNew = null;
        QcCommissionH qcCommissionHNew = null;
        if (jsonArray.size() > 0){
            for (int i=0;i<jsonArray.size();i++){
                list.add(jsonArray.getJSONObject(i).get("project").toString());
            }
            try{
                projectList = new ArrayList<String>(new TreeSet<String>(list));
                for (String projectName : projectList){
                    //project表更新
                    project = projectService.getProjectByPrimaryKey(projectName);
                    projectNew = project;
                    qcCommissionH = qcCommissionHService.selectQMHByBillno(projectName);
                    qcCommissionHNew = qcCommissionH;
                    if ("单项".equals(project.getcCoaFormat().trim())){
                        //projectNew.setcCoaFormat(whole);
                        //qcCommissionHNew.setReportformat(wholePk);
                        customerSqlService.update("update project set c_coa_format = '" + whole + "' where name = '"+ projectName + "'" );
                        customerSqlService.update("update qc_commission_h set reportformat = '"+ wholePk +"' where billno = '" + projectName + "'");
                    }
                    if ("成套".equals(project.getcCoaFormat().trim())){
                        //projectNew.setcCoaFormat(single);
                        //qcCommissionHNew.setReportformat(singlePk);
                        customerSqlService.update("update project set c_coa_format = '" + single + "' where name = '"+ projectName + "'" );
                        customerSqlService.update("update qc_commission_h set reportformat = '"+ singlePk +"' where billno = '" + projectName + "'");
                    }
                    //projectService.updateProject(projectNew);
                    //qcCommissionHService.updateQcCommH(qcCommissionHNew);
                }
                flag = "1";
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return flag;
    }

    /**
     * 报告重签：报告下载前处理
     */
    @RequestMapping(value = "/processReport",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject processReport(@RequestBody String jsonStr){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status",0);
        jsonObject.put("des","转换错误");
        String target = "";
        List<String> targetList = new ArrayList<String>();
        logger.info("开始处理excel....");
        JSONArray json = JSONArray.parseArray(jsonStr);
        //获取时间戳
        String timestamp = String.valueOf(System.currentTimeMillis());
        try{
            //excel转pdf
            List<String> sourceExcel = new ArrayList<String>();
            for (int i = 0 ; i < json.size() ; i++){
                target = (json.get(i).toString()).substring(0,(json.get(i).toString()).lastIndexOf("."));
                mergeExcelService.excel2pdf("D:\\resignreport\\" + json.get(i).toString(),"D:\\resignreport\\mergeExcel\\" + target + ".pdf");
                targetList.add("D:\\resignreport\\mergeExcel\\" + target + ".pdf");
            }
            //pdf合并
            List<File> filesList = new ArrayList<File>();
            for (String fileName : targetList){
                filesList.add(new File(fileName));
            }
            if (filesList.size() > 1) {
                File f = mergeExcelService.mulFile2One(filesList, "D:\\resignreport\\mergeExcel\\mutile" + timestamp + ".pdf");
            }else {
                for (File file:filesList){
                    Files.copy(file.toPath(),new File("D:\\resignreport\\mergeExcel\\mutile" + timestamp + ".pdf").toPath());
                }
            }
            //pdf签章加密

            //pdf压缩  D:\resignreport\finalpdfs
            mergeExcelService.CompressPdf("D:\\resignreport\\mergeExcel\\mutile"+ timestamp +".pdf","D:\\resignreport\\finalpdfs\\finalpdf" + timestamp +".pdf");
            //去除压缩的水印
            mergeExcelService.clearSpireCompressLogoFlag("D:\\resignreport\\finalpdfs\\finalpdf" + timestamp +".pdf","D:\\resignreport\\finalresign\\resign"+ timestamp +".pdf");
            //下载
            //String finalName = "D:\\resignreport\\finalresign\\resign"+ timestamp +".pdf";

            //String finalName = "/finalReport/" + "resign"+ timestamp +".pdf";
            String finalName = "resign"+ timestamp +".pdf";
            //ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            //HttpServletResponse response = servletRequestAttributes.getResponse();
            //downloadService.downloadFile(response,finalName);
            //downloadService.downLoad(response,finalName);



            jsonObject.put("status",200);
            jsonObject.put("file",finalName);
            jsonObject.put("des","转换完成");
        }catch (Exception e){
            logger.error("处理excel出错");
        }
        logger.info("结束处理excel....");
        return jsonObject;
    }





    /**
     * 查找待生成的报告
     * @param jsonStr
     * @return
     */
    @RequestMapping(value = "/searchReport",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject searchReport(@RequestBody String jsonStr){
        logger.info("================{}",SecurityUtils.getSubject().getPrincipal().toString());
        System.out.println(SecurityUtils.getSubject().getPrincipal().toString());
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        String taskid = jsonObject.get("taskid").toString();
        List<CProjTask> cptList = cprojTaskService.getTaskForReport(taskid);
        logger.info("报告重签功能:开始检索报告...");
        List jsonList = new ArrayList<>();
        JSONArray jsonArray = new JSONArray();
        if (cptList.size() > 0 && cptList != null){
            jsonObject.put("status","1");
            jsonObject.put("des","检索成功，共计" + cptList.size() + "条记录");
            jsonObject.put("size",cptList.size());
            String filePath = null;
            for (CProjTask cProjTask : cptList){
                //此处组装的为三个东西，序列号、任务号、报告excel的文件地址
                filePath = customerSqlService.selectOne("select r.report_file_name from report_upload_record r where r.isprocess = 'T' and r.isupload = 'T' and r.report_from_taskid = '" + cProjTask.getTaskId() + "'");
                jsonList.add(cProjTask.getTaskId() + ":" + filePath);
                jsonArray.add(cProjTask.getTaskId() + ":" + filePath);
            }
            //检索到报告
            jsonObject.put("data",jsonArray);
        }else {
            //未检索到报告
            jsonObject.put("status","-1");
            jsonObject.put("des","未检索到您查找的报告，请确认单据号");
        }
        logger.info("报告重签功能:检索报告结束...");
        return jsonObject;
    }

}
