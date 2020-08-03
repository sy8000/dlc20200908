package cn.besbing.Conctrollers;


import cn.besbing.CommonUtils.MaintainModel.PageDataResult;
import cn.besbing.CommonUtils.MaintainModel.SearchDTO;
import cn.besbing.Entities.AnalysisTable;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 此类做为dataloader cloud中简化表格的控制器，如分析模板更新等
 */

@Controller
public class TableController {

    @RequestMapping(value = "/getAnalysisDataForTable",method = RequestMethod.POST)
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
                keyword = jsonObject.get("name").toString();
            }
            SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
            //pdr = taskInfoService.getTask(searchDTO);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pdr;
    }
}
