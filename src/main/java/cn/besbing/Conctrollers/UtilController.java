package cn.besbing.Conctrollers;

import cn.besbing.CommonUtils.AboutJson.ConverToJson;
import cn.besbing.CommonUtils.Utils.MailDTO;
import cn.besbing.Service.Impl.MailServiceImpl;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UtilController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MailServiceImpl mailService;

    /**
     * 邮件发送
     */
    //@RequestMapping(value = "/sendMailFromNc",method = RequestMethod.POST)
    //public void sendMailFromNc(MailDTO mailDTO){
        //mailService.sendMail(mailDTO);
    //}


    @RequestMapping(value = "/curtail",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject sendMail(@RequestBody JSONObject json){
        List<String> result = new ArrayList<>();
        ConverToJson converToJson = new ConverToJson();
        JSONObject jsonObject = new JSONObject();
        MailDTO mailDTO = new MailDTO();
        mailDTO.setSubject(json.get("subject").toString());
        mailDTO.setContext(json.get("context").toString());

        List<String> list = new ArrayList<>();

        try{
            list = (List<String>) json.get("toUsers");
            String[] array=list.toArray(new String[list.size()]);
            mailDTO.setToUsers(array);
            mailService.sendMail(mailDTO);
            result.add("success");
        }catch (Exception e){
            result.add(e.getStackTrace().toString());
        }finally {
            return converToJson.ListToJson(result);
        }
    }

}
