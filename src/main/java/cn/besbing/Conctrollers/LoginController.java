package cn.besbing.Conctrollers;

import cn.besbing.Entities.SmUser;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import cn.besbing.Service.Impl.SmuserServiceImpl;
import cn.besbing.Shiro.CustomRealm;
import com.alibaba.fastjson.JSONObject;
import com.geasy.NC6PasswordUtil;
import org.apache.commons.collections.map.HashedMap;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private SmuserServiceImpl smuserService;


    //@JSONField(serializeUsing = StringToJsonSerializer.class)
    //private String json ;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/maintain",method = RequestMethod.GET)
    public String maintain(){
        return "maintain";
    }



    //post登录
    @ResponseBody
    @RequestMapping(value = "/valid",method = RequestMethod.POST)
    //public Map<String, String> login(Model model, @RequestBody String loginMap){
    public JSONObject login(Model model,@RequestParam java.util.LinkedHashMap loginMap){
        Map<String,Object> result = new HashedMap();
        String pwd = "";

        JSONObject jsonObject = new JSONObject();

        CustomRealm customRealm = new CustomRealm();
        DefaultSecurityManager defaultSecurityManager =  new DefaultSecurityManager();
        defaultSecurityManager.setRealm(customRealm);

        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        System.out.println(loginMap.get("username").toString());
        System.out.println(loginMap.get("password").toString());
        //UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("abc","def");
        //Map<String,String> log = new HashedMap();
        try{
            SmUser smUser  = smuserService.selectUserPasswordByUserCode(loginMap.get("username").toString());
            if (smUser != null){
                pwd = NC6PasswordUtil.getEncodedPassword(smUser.getCuserid().toString(), loginMap.get("password").toString());
                System.out.println("pwd===================" + pwd);
            }else {
                jsonObject.put("resultCode",100);
                jsonObject.put("resultValue","用户不存在");
                System.out.println(new JSONObject(result).toString());
                return jsonObject;
            }
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(smUser.getUserCode().toString(), pwd);
            subject.login(usernamePasswordToken);
            System.out.println(subject.isAuthenticated());
            //model.addAttribute(subject);
            Session session = subject.getSession();
            //session.setAttribute("username",loginMap.get("username").toString());
            jsonObject.put("resultCode",200);
            jsonObject.put("resultValue","用户名正常");

        }catch (UnknownAccountException e){
            //用户名不存在
            //model.addAttribute("msg","用户名不存在");
            jsonObject.put("resultCode",100);
            jsonObject.put("resultValue","用户名错误");
        }catch (IncorrectCredentialsException e) {
            //密码错误
            //model.addAttribute("msg","密码错误");
            jsonObject.put("resultCode",100);
            jsonObject.put("resultValue","密码错误");
        }catch (AuthenticationException ae) {
            //model.addAttribute("msg","其它错误");
            result.put("resultCode",100);
            result.put("resultValue","其它错误");
        }
        //System.out.println(new JSONObject(result).toString());
        //return new JSONObject(result).toString();
        return  jsonObject;
    }
}
