package com.app.yjzlibs.baselib.bean.device_manage;

/**
 * Created by yujinzhao on 18/5/30.
 */

public class OldRtuType {

    /**
     * rtu_type_id : 2
     * type_name : 老主控板
     * is_old : 1
     */

    public String getShowName(){
        return type_name;
    };

    private int rtu_type_id;
    private String type_name;
    private int is_old;

    public int getRtu_type_id() {
        return rtu_type_id;
    }

    public void setRtu_type_id(int rtu_type_id) {
        this.rtu_type_id = rtu_type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public int getIs_old() {
        return is_old;
    }

    public void setIs_old(int is_old) {
        this.is_old = is_old;
    }
}
