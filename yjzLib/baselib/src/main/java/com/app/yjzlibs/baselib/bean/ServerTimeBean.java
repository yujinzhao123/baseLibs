package com.app.yjzlibs.baselib.bean;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by yujinzhao on 18/4/23.
 */

public class ServerTimeBean {
    public String time;
    public long timestamp;
    private static long deviation;

    public static long getServerTime() {

        return System.currentTimeMillis() - deviation;
    }

    public static void init(ServerTimeBean bean) {
        if (bean == null || bean.timestamp == 0) {
            deviation = 0;
        } else {
            deviation = System.currentTimeMillis() - bean.timestamp * 1000;
        }
    }

    public static String getTimeStr(Long startTime) {
        startTime = startTime * 1000;
        return long2timeString(dateDiff(new Date(startTime), new Date(getServerTime()), Calendar.HOUR)) + ":"
                + long2timeString(dateDiff(new Date(startTime), new Date(getServerTime()), Calendar.MINUTE)) + ":"
                + long2timeString(dateDiff(new Date(startTime), new Date(getServerTime()), Calendar.SECOND));
    }

    public static String getEndTimeStr(long endTime) {

        long differTime = getServerTime() / 1000 - endTime;

        String str = "";

        if (differTime < 60 * 6) {//
            str = "刚刚";
        } else if (differTime < 60 * 60) {
            str = differTime / 60 + "分钟前";
        } else if (differTime < 60 * 60 * 24){
            str = differTime / (60 * 60) + "小时前";
        }else if (differTime < 60 * 60 * 24 *30){
            str = differTime / (60 * 60 * 24) + "天前";
        }else {
            str = differTime / (60 * 60 * 24 *30) + "月前";
        }
        return str;
    }

    public static String long2timeString(Long l) {
        if (l < 10) {
            return "0" + l;
        } else {
            return l + "";
        }
    }

    /**
     * 根据指定类型计算两个日期相差的时间
     * eg. dateDiff(birth, today, Calendar.MONTH) 孩子的月龄
     *
     * @param sDate    开始时间
     * @param eDate    结束时间
     * @param diffType 日期类型
     * @return 根据 diffType计算的 eDate - sDate 时差
     */
    public static Long dateDiff(Date sDate, Date eDate, int diffType) {
        Calendar calst = Calendar.getInstance();
        Calendar caled = Calendar.getInstance();

        calst.setTime(sDate);
        caled.setTime(eDate);

        long diffMill = caled.getTime().getTime() - calst.getTime().getTime();
        long rtn = 0;
        switch (diffType) {
            case Calendar.MILLISECOND:
                rtn = diffMill;
                break;
            case Calendar.SECOND:
                rtn = diffMill / 1000 % 60;
                break;
            case Calendar.MINUTE:
                rtn = diffMill / 1000 / 60 % 60;
                break;
            case Calendar.HOUR:
                rtn = diffMill / 1000 / 3600;
                break;
            case Calendar.DATE:
                rtn = diffMill / 1000 / 60 / 60 / 24;
                break;
            case Calendar.MONTH:
                rtn = diffMill / 1000 / 60 / 60 / 24 / 12;
                break;
            case Calendar.YEAR:
                rtn = diffMill / 1000 / 60 / 60 / 24 / 365;
                break;
        }
        return rtn;
    }
}
