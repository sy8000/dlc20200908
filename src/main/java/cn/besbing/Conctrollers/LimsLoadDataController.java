package cn.besbing.Conctrollers;

import cn.besbing.CommonUtils.MaintainModel.PageDataResult;
import cn.besbing.CommonUtils.MaintainModel.SearchDTO;
import cn.besbing.Service.Impl.IQcCommissionHServiceImpl;
import cn.besbing.Service.Impl.TaskInfoServiceImpl;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LimsLoadDataController {


    @Autowired
    IQcCommissionHServiceImpl iQcCommissionHService;

    @Autowired
    TaskInfoServiceImpl taskInfoService;


    /**
     * 任务单表体审批状态：-1为自由态，3为提交态，2为客户主管审核通过
     * @param page
     * @param limit
     * @param keyword
     * @return
     */
    @RequestMapping(value = "/CustomerManagerTableInfo",method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getTaskInfo(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
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
                keyword = jsonObject.get("project").toString();
            }
            SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
            pdr = iQcCommissionHService.getProject(searchDTO);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pdr;
    }


    @RequestMapping(value = "/TechEngineerTaskByUser",method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getTechEngineerTaskByUser(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
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
            pdr = taskInfoService.getTechEngineerTask(searchDTO);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pdr;
    }


}
