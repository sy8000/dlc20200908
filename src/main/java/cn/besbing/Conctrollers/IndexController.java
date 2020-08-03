package cn.besbing.Conctrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/main")
    public String FowardIndex(){
        return "maintain";
    }

    @RequestMapping("/content")
    public String content(){
        return "logintest";
    }
}
