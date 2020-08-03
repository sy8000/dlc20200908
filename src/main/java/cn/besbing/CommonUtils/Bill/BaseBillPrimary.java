package cn.besbing.CommonUtils.Bill;

import java.util.Random;

public class BaseBillPrimary {

    /**
     * sheny 2020.6.9
     * version : init
     * func : get bill primary key 20 bit with module name(Module Name at bill number prefix.for example:QCCO + DFDFDKJFFKJDKJFDKFJ)
     * @param moduleName
     * @return
     */

    public String getPrimaryWithMoudleName(String moduleName){

        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int strOtherLength = 20 - moduleName.length();
        StringBuffer sb = new StringBuffer();
        int number = 0;
        Random random = new Random();
        for (int i=0;i<strOtherLength;i++){
            number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return moduleName + sb.toString();
    }


    /**
     * sheny 2020.6.9
     * version : init
     * func : get a String , length define by ur self
     * @param num
     * @return
     */

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
