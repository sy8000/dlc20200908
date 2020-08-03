package cn.besbing.Conctrollers;


import cn.besbing.CommonUtils.AboutJson.ConverToJson;
import cn.besbing.Entities.LimsUsers;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import cn.besbing.Service.Impl.ILimsUsersServiceImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ParamController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CustomerSqlServiceImpl customerSqlService;

    @RequestMapping(value = "/getAllTaskUnDownload",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getAllTask(){
        JSONObject jsonObject = new JSONObject();
        String sql = "select task_id from c_proj_task where c_is_downparam = 'F' or c_is_downparam is null ";
        List<Map<String, Object>> taskidList = customerSqlService.selectList(sql);
        if (taskidList.size() > 0){
            jsonObject.put("code",200);
            jsonObject.put("msg","success");
            jsonObject.put("data", JSON.toJSON(taskidList));
        }else {
            jsonObject.put("code",0);
            jsonObject.put("msg","error");
        }
        logger.info("*********************trans all taskid*****************************");
        return jsonObject;
    }


    @Autowired
    ILimsUsersServiceImpl iLimsUsersService;

    @RequestMapping(value = "/getAllUserFromLims",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getAllUserLims(){
        List<LimsUsers> allUser = new ArrayList<>();
        allUser = iLimsUsersService.getAllUserFromLims();
        ConverToJson converToJson = new ConverToJson();
        return converToJson.ListToJson(allUser);
    }

}
