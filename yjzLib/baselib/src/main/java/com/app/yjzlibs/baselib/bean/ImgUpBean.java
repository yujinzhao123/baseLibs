package com.app.yjzlibs.baselib.bean;

import java.util.List;

/**
 * Created by yujinzhao on 18/4/27.
 */

public class ImgUpBean {

    public String localPath;

    public static String getName(List<ImgUpBean> list){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                stringBuffer.append("%3B");
            }
            stringBuffer.append(list.get(i).localPath);
        }
        return stringBuffer.toString();
    }

    /**
     * 保留文件名及后缀
     */
    public static String getFileNameWithSuffix(String pathandname) {
        int start = pathandname.lastIndexOf("/");
        if (start != -1 ) {
            return pathandname.substring(start + 1);
        } else {
            return null;
        }
    }

}
