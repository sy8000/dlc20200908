package cn.besbing.Service.Impl;

import cn.besbing.Service.IBillPrimaryKey;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BillPrimaryKeyImpl implements IBillPrimaryKey {

    public String getPrimaryWithoutModuleName(int num){
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuffer sb = new StringBuffer();
        int number = 0;
        Random random = new Random();
        for (int i=0;i<num;i++){
            number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

}
