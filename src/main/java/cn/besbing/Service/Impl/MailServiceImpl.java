package cn.besbing.Service.Impl;

import cn.besbing.CommonUtils.Utils.MailDTO;
import cn.besbing.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;


@Service
public class MailServiceImpl implements MailService {

    @Autowired(required = false)
    MailSender mailSender;

    public void sendMail(MailDTO mailDTO){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject(mailDTO.getSubject());
        mailMessage.setText(mailDTO.getContext());
        mailMessage.setTo(mailDTO.getToUsers());
        mailMessage.setFrom("lab@hongfa.cn");
        mailSender.send(mailMessage);
    }



}
