package com.app.yjzlibs.baselib.bean.map;


import cn.greenhn.android_pad.bean.ServerTimeBean;
import cn.greenhn.android_pad.bean.valve.RelayBean;

/**
 * Created by yujinzhao on 18/5/3.
 */

public class MapIconBean {

    public Mode mode;
    public RelayBean relayBean;
    public String name;
    public String index;
    public AreasBean areasBean;
    public long cameraId;


    public boolean isSelect = false;

    public String getStateStr() {

        if (mode == Mode.FA_MENG){//1是关闭 2是开启 3是故障  1-2(4)  2-1(5) 3-2(6)
            switch (relayBean.relays_state){
                case 1:
                    return "";
                case 2:
                    return ServerTimeBean.getTimeStr(relayBean.start_time);
                case 3:
                    return "故障";
                case 4:
                    return "开启中...";
                case 5:
                    return "关闭中...";
                case 6:
                    return "开启中...";
            }


        }

        return "";
    }


    public enum Mode{
        SHUI_BEANG,FA_MENG,SHE_XIANG_TOU;
    }
}
