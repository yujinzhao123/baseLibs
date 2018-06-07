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
}
