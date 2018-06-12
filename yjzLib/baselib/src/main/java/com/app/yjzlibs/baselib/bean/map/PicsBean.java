package com.app.yjzlibs.baselib.bean.map;

/**
 * Created by yujinzhao on 18/5/25.
 */

public class PicsBean {


    /**
     * pic_id : 1
     * camera_id : 1
     * farm_id : 1
     * time : 1527167065
     * pic_url : https://cdn1.greenhn.cn/ganlin/upload/gam/1527061263xH5.jpg
     */

    private long pic_id;
    private long camera_id;
    private long farm_id;
    private long time;
    private String pic_url;

    public long getPic_id() {
        return pic_id;
    }

    public void setPic_id(long pic_id) {
        this.pic_id = pic_id;
    }

    public long getCamera_id() {
        return camera_id;
    }

    public void setCamera_id(long camera_id) {
        this.camera_id = camera_id;
    }

    public long getFarm_id() {
        return farm_id;
    }

    public void setFarm_id(long farm_id) {
        this.farm_id = farm_id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }
}
