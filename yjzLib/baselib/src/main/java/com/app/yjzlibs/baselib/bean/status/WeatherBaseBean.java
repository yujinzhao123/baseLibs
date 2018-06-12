package com.app.yjzlibs.baselib.bean.status;

/**
 * Created by yujinzhao on 18/5/17.
 */

public class WeatherBaseBean {

    /**
     * location : 19.5090960000,110.1351710000
     * node_id : 1
     */

    private String location;
    private long node_id;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getNode_id() {
        return node_id;
    }

    public void setNode_id(long node_id) {
        this.node_id = node_id;
    }
}
