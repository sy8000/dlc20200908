package cn.besbing.Conctrollers;

import cn.besbing.CommonUtils.Utils.MailDTO;
import cn.besbing.Service.Impl.MailServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

public class DataLoaderMailController {

    @Autowired
    MailServiceImpl mailService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JavaMailSender mailSender;

    public void sendImgMail(MailDTO mailDTO){

        try {
            MimeMessage message =mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message,true);
            mimeMessageHelper.setFrom("lab@hongfa.cn");
            mimeMessageHelper.setTo(mailDTO.getToUsers());
            mimeMessageHelper.setSubject(mailDTO.getSubject());
            mimeMessageHelper.setText("<html><head></head><body><h1>hello!!spring image html mail</h1>" +
                    "<img src='cid:MyImg'/></body></html>",true);
            File file = new File("c:/QRCODE.jpg");
            mimeMessageHelper.addInline("MyImg",file);
            mailSender.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
