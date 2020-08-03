package cn.besbing;


import cn.besbing.CommonUtils.Utils.MailDTO;
import cn.besbing.Service.Impl.MailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DloadercloudApplication.class)
public class TestMail {

    @Autowired
    MailServiceImpl mailService;

    @Test
    public void TestMail(){
        MailDTO mailDTO = new MailDTO();
        mailDTO.setContext("auto mail");
        mailDTO.setToUsers(new String[]{"1002437@hongfa.cn", "1000514@hongfa.cn"});
        mailService.sendMail(mailDTO);
    }


}
