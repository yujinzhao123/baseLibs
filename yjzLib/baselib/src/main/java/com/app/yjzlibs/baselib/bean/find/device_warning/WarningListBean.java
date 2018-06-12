package com.app.yjzlibs.baselib.bean.find.device_warning;

import java.util.List;

/**
 * Created by yujinzhao on 18/5/24.
 */

public class WarningListBean {

    /**
     * number : 10
     * offset : 0
     * warns : [{"warn_id":90,"warn_time":1527090795,"data_type":2,"warn_type":"仪器器警告","warn_content":"实时流量表采集数据异常","warn_state":2}]
     */

    private int number;
    private int offset;
    private List<WarnsBean> warns;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public List<WarnsBean> getWarns() {
        return warns;
    }

    public void setWarns(List<WarnsBean> warns) {
        this.warns = warns;
    }

    public static class WarnsBean {
        /**
         * warn_id : 90
         * warn_time : 1527090795
         * data_type : 2
         * warn_type : 仪器器警告
         * warn_content : 实时流量表采集数据异常
         * warn_state : 2
         */

        private long warn_id;
        private long warn_time;
        private int data_type;
        private String warn_type;
        private String warn_content;
        private int warn_state;

        public long getWarn_id() {
            return warn_id;
        }

        public void setWarn_id(long warn_id) {
            this.warn_id = warn_id;
        }

        public long getWarn_time() {
            return warn_time;
        }

        public void setWarn_time(long warn_time) {
            this.warn_time = warn_time;
        }

        public int getData_type() {
            return data_type;
        }

        public void setData_type(int data_type) {
            this.data_type = data_type;
        }

        public String getWarn_type() {
            return warn_type;
        }

        public void setWarn_type(String warn_type) {
            this.warn_type = warn_type;
        }

        public String getWarn_content() {
            return warn_content;
        }

        public void setWarn_content(String warn_content) {
            this.warn_content = warn_content;
        }

        public int getWarn_state() {
            return warn_state;
        }

        public void setWarn_state(int warn_state) {
            this.warn_state = warn_state;
        }
    }
}
