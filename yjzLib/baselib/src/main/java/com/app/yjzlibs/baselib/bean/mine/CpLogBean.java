package com.app.yjzlibs.baselib.bean.mine;

/**
 * Created by yujinzhao on 18/6/2.
 */

public class CpLogBean {

    /**
     * log_id : 2233
     * user_id : 2
     * user_name : test
     * log_time : 1527920537
     * data_type : 1
     * data_id : 23
     * log_content : 关闭阀门冬瓜B10
     */

    private long log_id;
    private long user_id;
    private String user_name;
    private long log_time;
    private int data_type;
    private int data_id;
    private String log_content;

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public long getLog_time() {
        return log_time;
    }

    public void setLog_time(long log_time) {
        this.log_time = log_time;
    }

    public int getData_type() {
        return data_type;
    }

    public void setData_type(int data_type) {
        this.data_type = data_type;
    }

    public int getData_id() {
        return data_id;
    }

    public void setData_id(int data_id) {
        this.data_id = data_id;
    }

    public String getLog_content() {
        return log_content;
    }

    public void setLog_content(String log_content) {
        this.log_content = log_content;
    }
}
