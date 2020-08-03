package cn.besbing.Conctrollers;

import cn.besbing.CommonUtils.AboutJson.ConverToJson;
import cn.besbing.CommonUtils.MaintainModel.LimsResultOpration;
import cn.besbing.CommonUtils.MaintainModel.PageDataResult;
import cn.besbing.CommonUtils.MaintainModel.SearchDTO;
import cn.besbing.Entities.Result;
import cn.besbing.Service.Impl.*;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerSqlController {

    @Autowired
    CustomerSqlServiceImpl customerSqlService;

    @Autowired
    InstrumentsServiceImpl instrumentsService;

    @Autowired
    TaskInfoServiceImpl taskInfoService;


    @Autowired
    AllTaskServiceImpl allTaskService;

    @Autowired
    ResultServiceImpl resultService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 登录页跳转
     * @param model
     * @return
     */
    @RequestMapping(value = "/welcomemain",method = RequestMethod.GET)
    public String welcommain(Model model){
        logger.info("************开始加载maintain的页面信息********************");
        /*MaintainModelUtils maintainModelUtils = new MaintainModelUtils();
        model = maintainModelUtils.getMaintainUIData();*/
        //客户累计
        String creatorsSql = "select count(1) from (select distinct h.creator from qc_commission_h h where h.dr = 0)";
        String creatorsNum = customerSqlService.selectOne(creatorsSql);
        model.addAttribute("creators",creatorsNum);
        //web端委托单累计
        String webProjSql = "select count(1) from qc_commission_h h where h.dr = 0";
        String webProjNum = customerSqlService.selectOne(webProjSql);
        model.addAttribute("webProjNum",webProjNum);
        //web端任务单累计
        String webTaskSql = "select count(1) from qc_task_b b where b.dr = 0";
        String webTaskNum = customerSqlService.selectOne(webTaskSql);
        model.addAttribute("webTaskNum",webTaskNum);
        //labware传入统计
        String lwProjSql = "select count(1) from project p where p.ts is not null and p.closed = 'F' ";
        String lwTaskSql = "select count(1) from c_proj_task cpt where cpt.project in ";
        lwTaskSql += " (select p.name from project p where p.ts is not null and p.closed = 'F') " +
                "and upper(cpt.status) != 'X' ";

        String lwProjAndTaskNum = customerSqlService.selectOne(lwProjSql) + "/" + customerSqlService.selectOne(lwTaskSql);
        model.addAttribute("lwProjAndTaskNum",lwProjAndTaskNum);

        //统计sql
        /*String countSql = "select vdef1 from report_path where pk_report_path = '78901234567890123457'";
        String basicCountSql = customerSqlService.selectOne(countSql);
        String projCountSql = basicCountSql.replace("field","u.creationtime");
        projCountSql = projCountSql.replace("tablename","qc_commission_h u");
        List<Map<String, Object>> projList = customerSqlService.selectList(projCountSql);
        model.addAttribute("projList",projList);*/


        logger.info("************加载maintain的页面信息结束********************");
        return "pages/welcomemain";
    }

    /**
     *首页统计数据申请地址及返回
     * @param searchType
     * @return
     */
    @RequestMapping(value = "/TongjiReport",method = RequestMethod.POST)
    @ResponseBody
    public Object getTongjiReport(@Param("searchType")String searchType){
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        if ("date".equals(searchType)) {
            //执行日期查询
            List<Map<String, Object>> dateList = customerSqlService.
                    selectList("select to_char (sysdate- level + 1, 'yyyy-mm-dd') today FROM DUAL connect BY " +
                            "LEVEL <= 7 order by today asc");
            System.out.println("**************************");
            String s = "";
            //获取日期
            for (int i = 0; i < dateList.size(); i++) {
                s = dateList.get(i).get("TODAY").toString().replace("\"","\'");
                jsonArray.set(i, s);
            }
            //按日期遍历各单
            JSONArray projData = new JSONArray();
            JSONArray taskData = new JSONArray();
            JSONArray startData = new JSONArray();
            JSONArray endData = new JSONArray();
            JSONArray reportData = new JSONArray();
            for (int i = 0;i < jsonArray.size();i++){
                //project
                projData.set(i,Integer.valueOf(customerSqlService.selectOne("select count(1) from qc_commission_h h where " +
                        "substr(h.creationtime,1,10) = '"+ jsonArray.get(i) +"' and dr = 0")));
                //c_proj_task
                taskData.set(i,Integer.valueOf(customerSqlService.selectOne("select count(1) from qc_task_b tb where " +
                        " tb.pk_task_h in (select th.pk_task_h from " +
                        " qc_task_h th where substr(th.creationtime,1,10) = '"+ jsonArray.get(i) + "' and dr = 0)")));
                //au_start_time
                startData.set(i,Integer.valueOf(customerSqlService.selectOne("select count(1) from c_arrangement ca where " +
                        " substr(to_char(ca.acture_start_date,'yyyy-mm-dd'),1,10) = '"+ jsonArray.get(i) + "' " +
                        " and ca.status != 'X'")));
                //au_end_time
                endData.set(i,Integer.valueOf(customerSqlService.selectOne("select count(1) from c_arrangement ca where " +
                        " substr(to_char(ca.acture_end_date,'yyyy-mm-dd'),1,10) = '"+ jsonArray.get(i) + "' " +
                        " and ca.status != 'X'")));
                //report_sign
                reportData.set(i,Integer.valueOf(customerSqlService.selectOne("select count(1) from c_proj_task c where  " +
                        " substr(to_char(c.c_reportsignature_date,'yyyy-mm-dd'),1,10) = '"+ jsonArray.get(i) + "' " +
                        " and c.status = 'T'")));
            }

            //整理json
            String []legendArr = new String[]{"委托单","任务单","开始试验","结束试验","报告签发"};
            jsonObject.put("category",jsonArray);
            jsonObject.put("legend",legendArr);
            jsonObject.put("projData",projData);
            jsonObject.put("taskData",taskData);
            jsonObject.put("startData",startData);
            jsonObject.put("endData",endData);
            jsonObject.put("reportData",reportData);
            //System.out.println(jsonObject);
            return jsonObject;
        }
        return "";
    }


    /**
     * 任务管理页面
     * @return
     */
    @RequestMapping(value = "/task",method = RequestMethod.GET)
    public String task(){
        return "pages/task.html";
    }

    @RequestMapping(value = "/TaskInfo",method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getTaskInfo(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
        /*List<TableTaskFields> tableTaskFieldsList = taskInfoService.getTask();
        ConverToJson converToJson = new ConverToJson();
        return converToJson.ListToJson(tableTaskFieldsList);*/
        PageDataResult pdr = new PageDataResult();
        JSONObject jsonObject = new JSONObject();
        try {
            if (null == page) {
                page = 1;
            }
            if (null == limit) {
                limit = 10;
            }
            //System.out.println(keyword);
            if (keyword != null && keyword != ""){
                jsonObject = JSONObject.parseObject(keyword);
                keyword = jsonObject.get("taskid").toString();
            }
            SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
            pdr = taskInfoService.getTask(searchDTO);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pdr;
    }

    /**
     * 通过sql_records表查询语句
     * {paramtype:init/after,taskid:string}
     * @return json
     */
    @RequestMapping(value = "/getParameters",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getTestParameters(String type,String taskid){
        JSONObject jsonObject = new JSONObject();
        String sql = "";
        if ("init".equals(type)){
            sql = customerSqlService.selectOne("select sql_text from sql_records where sql_code = 'init' ");
            sql = sql.replace("sheny",taskid.substring(0,13));
            //List<Map<String, Object>> maps = customerSqlService.selectList(sql);
            ConverToJson converToJson = new ConverToJson();
            jsonObject = converToJson.ListToJson(customerSqlService.selectList(sql));
        }else {
            sql = customerSqlService.selectOne("select sql_text from sql_records where sql_code = 'after' ");
            sql = sql.replace("sheny",taskid);
            //List<Map<String, Object>> maps = customerSqlService.selectList(sql);
            ConverToJson converToJson = new ConverToJson();
            jsonObject = converToJson.ListToJson(customerSqlService.selectList(sql));
        }
        return jsonObject;
    }

    /**
     * 接收传的josn，自动写参数到result
     * 传入json格式
     * {
     *     [{...},{...}]
     * }
     * 逻辑说明：接收小垂上传的jsonarray格式数组，转换为json后，依次取出，test_number、sample_number、result.name三个字段进行查询
     * 如果有则执行行updateByThreePrimary(test_number,sample_number,result.name)
     * 如果没有，则syncronized以事务运行incriments获取最大result_number和entry_code，然后立即锁死
     * 执行updatebyprimary默认方法
     * 返回成功的json
     */
    @RequestMapping(value = "/upLoadParameters",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject writeResult(@RequestBody String uploadParams){
        JSONObject datajson = JSONObject.parseObject(uploadParams);
        //把小垂上传的jsonarray解析出来
        //JSONArray jsonArray = JSONArray.parseArray(uploadParams);
        JSONArray jsonArray = (JSONArray)datajson.get("data");
        JSONObject jsonObject = new JSONObject();
        Result result = new Result();
        List<String> returnList = new ArrayList<>();
        for (int i=0;i<jsonArray.size();i++){
            logger.info("开始解析小垂上传的第{}行参数...",i);
            try{
                jsonObject = jsonArray.getJSONObject(i);
                result.setTestNumber(Long.valueOf(jsonObject.get("testNumber").toString()));
                result.setSampleNumber(Long.valueOf(jsonObject.get("sampleNumber").toString()));
                result.setName(jsonObject.get("name").toString());
                result.setEntry(jsonObject.get("entry").toString());
                result.setEnteredBy(jsonObject.get("enteredBy").toString());
                result.setFormattedEntry(jsonObject.get("entry").toString());
                result.setMinimum(jsonObject.get("minimum").toString());
                result.setMaximum(jsonObject.get("maximum").toString());
                //result.setUnits(jsonObject.get("units").toString());
                //result.setAnalysis(jsonObject.get("analysis").toString());
                if (jsonObject.get("analysis").toString().trim().length() > 13){
                    result.setAnalysis("继电器企标试验后参数");
                }else {
                    result.setAnalysis("继电器企标初始参数");
                }
            }catch (Exception e){
                logger.error("{}类解析小垂上传的参数第{}行出错!!!错误描述:{}",this.getClass().getName(),i,e.getStackTrace());
            }
            logger.info("解析小垂上传的第{}行参数完成...",i);
            //转普通类，以事务运行更新或新增
            LimsResultOpration limsResultOpration = new LimsResultOpration();
            returnList.add(limsResultOpration.paramProcessor(result));
        }
        logger.info("参数上传结束...");
        return new ConverToJson().ListToJson(returnList);
    }

    /**
     * 仪器需求：使用地点、责任人，仪器状态（使用中、停用、报废、维修、限用、遗失、转让、封存）、校准机构（自动提示）
     * 加属性：校准、定期维护、授权、日常点检、期间核查、使用登记，（控制c_PM_INFO是否生效，多选）
     * @return
     */

    @RequestMapping(value = "/instruments",method = RequestMethod.GET)
    public String forwardPage(){
        return "pages/instruments.html";
    }

    /**
     * 仪器管理跳转
     * @return
     */
    @RequestMapping(value = "/getinstruments",method = RequestMethod.GET)
    @ResponseBody
    public PageDataResult getInstruments(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
        PageDataResult pdr = new PageDataResult();
        JSONObject jsonObject = new JSONObject();
        try {
            if (null == page) {
                page = 1;
            }
            if (null == limit) {
                limit = 10;
            }
            //System.out.println(keyword);
            if (keyword != null && keyword != ""){
                jsonObject = JSONObject.parseObject(keyword);
                keyword = jsonObject.get("name").toString();
            }
            SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
            pdr = instrumentsService.allInstruments(searchDTO);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pdr;
    }

    /*@RequestMapping(value = "/getinstruments",method = RequestMethod.GET)
    @ResponseBody
    public Object getInstruments(){
        List<InstrumentsWithBLOBs>  instruments = instrumentsService.allInstruments();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",0);
        jsonObject.put("msg","");
        jsonObject.put("count",instrumentsService.countByExample(null));
        jsonObject.put("data",JSON.toJSON(instruments));

        return jsonObject;
    }*/

    /**
     *
     * @param obj  微服务端传入的参数，格式为"rowid_taskid"，用split切分后，去查询，如果有则返回试验名称和样品名称，没有则直接返回错误
     * @return
     */
    @RequestMapping(value = "/ValidReports",method = RequestMethod.GET)
    @ResponseBody
    public Object getReportValid(Object obj){
        logger.info(obj.toString());
        String returnValue = "";
        String unionString = obj.toString();
        String[] param = unionString.split("_");
        String sql = "select 1 from c_porj_task where rowid = '" + param[0] + "' and task_id = '" + param[1] + "'";
        String result =  customerSqlService.selectOne(sql);
        if (result != null){
            returnValue = "报告无误";
        }else{
            returnValue = "报告非检测中心出具";
        }
        return returnValue;
    }




    @RequestMapping(value = "/AllTaskProgess",method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getAllTaskProgess(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
        PageDataResult pdr = new PageDataResult();
        JSONObject jsonObject = new JSONObject();
        try {
            if (null == page) {
                page = 1;
            }
            if (null == limit) {
                limit = 10;
            }
            //System.out.println(keyword);
            if (keyword != null && keyword != ""){
                jsonObject = JSONObject.parseObject(keyword);
                keyword = jsonObject.get("taskid").toString();
            }
            SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
            pdr = allTaskService.getTask(searchDTO);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pdr;
    }


}
