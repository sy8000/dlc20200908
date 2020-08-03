package cn.besbing.Conctrollers;

import cn.besbing.CommonUtils.MaintainModel.UpdateLimsBillStatus;
import cn.besbing.Entities.Component;
import cn.besbing.Entities.ComponentDefKey;
import cn.besbing.Entities.Result;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import cn.besbing.Service.Impl.IComponentServiceImpl;
import cn.besbing.Service.Impl.ResultServiceImpl;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
     */
    @RequestMapping(value = "/updateToTaskend",method = RequestMethod.POST)
    @ResponseBody
    public String updateToTaskend(@RequestBody String taskIds){
        int flag = 0;
        JSONArray jsonArray = JSONArray.parseArray(taskIds);
        JSONObject jsonObject = new JSONObject();
        //UpdateLimsBillStatus updateLimsBillStatus = new UpdateLimsBillStatus();
        //List<String> taskidList = new ArrayList<String>();
        for (int i=0;i<jsonArray.size();i++){
            jsonObject = jsonArray.getJSONObject(i);
            //taskidList.add(jsonObject.get("taskId").toString());
            flag += customerSqlService.update("update c_proj_task set status = 'F' where task_id = '"+ jsonObject.get("taskId").toString() +"' ");
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
                        result.setResultNumber(Long.valueOf(getResultNumber(resultNo)));
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




}
