package cn.besbing;

import cn.besbing.CommonUtils.Utils.EncryptUtil;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

public class TestMd5Salt {



    public static void main(String[] args) {



        String noEncodeStr = "1002437" + "&" + String.valueOf(new Date().getTime());
        String salt = "sheny1982";
        String md5 = EncryptUtil.getInstance().AESencode(noEncodeStr,salt);
        System.out.println(md5);
        System.out.println(EncryptUtil.getInstance().AESdecode(md5,salt));

        //String md5 = encryptUtil.getInstance().Base64Encode(noEncodeStr);

        //System.out.println(md5);


    }

}
