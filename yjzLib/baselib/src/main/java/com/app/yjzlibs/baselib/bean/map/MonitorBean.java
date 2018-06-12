package com.app.yjzlibs.baselib.bean.map;

import java.io.Serializable;

/**
 * Created by yujinzhao on 18/5/21.
 */

public class MonitorBean implements Serializable{

    /**
     * access_token : ra.6x3nvwkrd02a20nzbhsqjfw712e0tci3-6ihpg9w3b8-192dsts-73s3vmm4a
     * expire_time : 1527312765380
     * app_key : d7b21f99a6bd45dd9212b592e794153e
     * camera_id : 1
     * farm_id : 1
     * ys_id : 1
     * device_serial : 767915181
     * channel_no : 1
     * channel_name : DS-2CV3Q01EFD-IW(767915181)
     * pic_url : https://i.ys7.com/assets/imgs/public/homeDevice.jpeg
     * is_shared : 0
     * video_level : 0
     * is_encrypt : 0
     * status : 1
     */


    private long camera_id;
    private long farm_id;
    private long ys_id;
    private String device_serial;
    private int channel_no;
    private String channel_name;
    private String pic_url;
    private String is_shared;
    private int video_level;
    private int is_encrypt;
    private int status;



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

    public long getYs_id() {
        return ys_id;
    }

    public void setYs_id(long ys_id) {
        this.ys_id = ys_id;
    }

    public String getDevice_serial() {
        return device_serial;
    }

    public void setDevice_serial(String device_serial) {
        this.device_serial = device_serial;
    }

    public int getChannel_no() {
        return channel_no;
    }

    public void setChannel_no(int channel_no) {
        this.channel_no = channel_no;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getIs_shared() {
        return is_shared;
    }

    public void setIs_shared(String is_shared) {
        this.is_shared = is_shared;
    }

    public int getVideo_level() {
        return video_level;
    }

    public void setVideo_level(int video_level) {
        this.video_level = video_level;
    }

    public int getIs_encrypt() {
        return is_encrypt;
    }

    public void setIs_encrypt(int is_encrypt) {
        this.is_encrypt = is_encrypt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
