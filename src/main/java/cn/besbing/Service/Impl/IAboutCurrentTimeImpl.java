package cn.besbing.Service.Impl;

import cn.besbing.Service.IAboutCurrentTime;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class IAboutCurrentTimeImpl implements IAboutCurrentTime {


    /**  调用
     * // 获取指定long型的时间
     *     System.out.println(parseMillisecone(436765000L));
     *     ;
     *     // 获取时间差的秒数
     *     long diff = getDifference(new Date(), new SimpleDateFormat(
     *             "yyyy-MM-dd HH:mm:ss").parse("2020-12-10 00:00:00"), 0);
     *     System.out.println(getDifference(new Date(), new SimpleDateFormat(
     *             "yyyy-MM-dd HH:mm:ss").parse("2020-12-10 00:00:00"), 0));
     *     System.out.println("时间：" + parseMillisecone(diff));
     *     System.out.println("时间：" + parseMillisecone(diff * 1000));
     *
     */


    /**
     * 两个时间间的时间戳计算函数
     * @param beginDate
     * @param endDate
     * @param f  时间差的形式0:秒,1:分种,2:小时,3:天
     * @return  long 秒
     */
    public static long getDifference(Date beginDate, Date endDate, int f) {
        long result = 0;
        if (beginDate == null || endDate == null) {
            return 0;
        }
        try {
            // 日期相减获取日期差X(单位:毫秒)
            long millisecond = endDate.getTime() - beginDate.getTime();
            /**
             * Math.abs((int)(millisecond/1000)); 绝对值 1秒 = 1000毫秒
             * millisecond/1000 --> 秒 millisecond/1000*60 - > 分钟
             * millisecond/(1000*60*60) -- > 小时 millisecond/(1000*60*60*24) -->
             * 天
             * */
            switch (f) {
                case 0: // second
                    return  (millisecond / 1000);
                case 1: // minute
                    return (millisecond / (1000 * 60));
                case 2: // hour
                    return  (millisecond / (1000 * 60 * 60));
                case 3: // day
                    return (millisecond / (1000 * 60 * 60 * 24));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }



    /**
     * 计算时差 根据 long 返回时间点
     *
     * @param millisecond
     * @return string 0天0时11分55秒
     */
    public static String parseMillisecone(long millisecond) {
        String time = null;
        try {
            long yushu_day = millisecond % (1000 * 60 * 60 * 24);
            long yushu_hour = (millisecond % (1000 * 60 * 60 * 24))
                    % (1000 * 60 * 60);
            long yushu_minute = millisecond % (1000 * 60 * 60 * 24)
                    % (1000 * 60 * 60) % (1000 * 60);
            @SuppressWarnings("unused")
            long yushu_second = millisecond % (1000 * 60 * 60 * 24)
                    % (1000 * 60 * 60) % (1000 * 60) % 1000;
            if (yushu_day == 0) {
                return (millisecond / (1000 * 60 * 60 * 24)) + "天";
            } else {
                if (yushu_hour == 0) {
                    return (millisecond / (1000 * 60 * 60 * 24)) + "天"
                            + (yushu_day / (1000 * 60 * 60)) + "时";
                } else {
                    if (yushu_minute == 0) {
                        return (millisecond / (1000 * 60 * 60 * 24)) + "天"
                                + (yushu_day / (1000 * 60 * 60)) + "时"
                                + (yushu_hour / (1000 * 60)) + "分";
                    } else {
                        return (millisecond / (1000 * 60 * 60 * 24)) + "天"
                                + (yushu_day / (1000 * 60 * 60)) + "时"
                                + (yushu_hour / (1000 * 60)) + "分"
                                + (yushu_minute / 1000) + "秒";

                    }

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return time;
    }
}
