package cn.besbing;

import com.geasy.NC6PasswordUtil;
import org.junit.Test;



public class TestPasswd {

    @Test
    public  void pass() {
        String pwd = "123qwe";
        String passwd = NC6PasswordUtil.getEncodedPassword("1001TR1000000000096V", pwd);
        System.out.println(passwd);
    }
}
