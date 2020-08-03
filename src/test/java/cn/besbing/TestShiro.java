package cn.besbing;





import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



public class TestShiro {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    CustomRealm customRealm = new CustomRealm();

    @Test
    public void runshiro(){
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(customRealm);

        SecurityUtils.setSecurityManager(defaultSecurityManager);

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("sheny","abcdefg");

        subject.login(token);

        subject.checkRoles("admin");

        subject.checkPermission("user:add");

        System.out.println(subject.isAuthenticated());

    }

}
