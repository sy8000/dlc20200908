package cn.besbing.Conctrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RemappingController {



    @RequestMapping(value = "/taskDetailInfo",method = RequestMethod.GET)
    public String taskDetailInfo(){
        //return "http://10.0.11.82:8080/webroot/decision/view/report?viewlet=Report002-SQL.cpt&op=view";
        return "/pages/taskInfo";
    }


    @RequestMapping(value = "/taskProcess",method = RequestMethod.GET)
    public String taskProcess(){
        //return "http://10.0.11.82:8080/webroot/decision/view/report?viewlet=Report002-SQL.cpt&op=view";
        return "/pages/allTaskProgress";
    }

    @RequestMapping(value = "/forgetPass",method = RequestMethod.GET)
    public String forgetPass(){
        return "/pages/ForgetPassword";
    }

    @RequestMapping(value = "/resetPass",method = RequestMethod.GET)
    public String validurl(){
        return "/pages/ResetPassword";
    }


}
