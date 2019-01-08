package com.app.yjzlibs.baselib.tool;

import java.text.DecimalFormat;

/**
 * Created by yujinzhao on 18/5/11.
 */

public class StringUtil {

    public static String float2String(float f,String format){
        DecimalFormat decimalFormat = new DecimalFormat(format);//构造方法的字符格式这里如果小数不足2位,会以0补足.
        String p = decimalFormat.format(f);
        return p;
    }

    public static String float2String(float f){
        return float2String(f,"0.00");
    }

    /**
     * float保留小数 四舍五入
     * @param f
     * @param N 几位小数
     * @return
     */
    public static float float2N(float f,int N){
        return (float)(Math.round(f*10*N))/(10*N);
    }
}
