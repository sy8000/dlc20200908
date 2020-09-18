package cn.besbing;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTran {

    public static void main(String[] args) {
       /* String date = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date(Long.parseLong("1595952000000") * 500));
        System.out.println(date);
        String date1 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date(Long.parseLong("1595952000000") * 500));
        System.out.println(date1);*/
        System.out.println("A-200101-0911-01".substring(0,13));
    }

}
