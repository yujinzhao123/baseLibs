package com.app.yjzlibs.baselib.bean.device_manage;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yujinzhao on 18/5/28.
 */

public class DeviceListBean {

    public int number;
    public int offset;
    public List<DeviceBean> rtus;

    public static class DeviceBean implements Serializable{

        /**
         * rtu_id : 2
         * rtu_type : 1
         * rtu_name : RTU2
         * rtu_sn : 2100625609
         * rtu_time : 1523462400
         * farm_id : 1
         * reg_time : 1523462400
         * rtu_addr : 1
         * rtu_state : 2
         */

        private long rtu_id;
        private int rtu_type;
        private String rtu_name;
        private int rtu_sn;
        private long rtu_time;
        private long farm_id;
        private long reg_time;
        private int rtu_addr;
        private int rtu_state;

        public long getRtu_id() {
            return rtu_id;
        }

        public void setRtu_id(long rtu_id) {
            this.rtu_id = rtu_id;
        }

        public int getRtu_type() {
            return rtu_type;
        }

        public void setRtu_type(int rtu_type) {
            this.rtu_type = rtu_type;
        }

        public String getRtu_name() {
            return rtu_name;
        }

        public void setRtu_name(String rtu_name) {
            this.rtu_name = rtu_name;
        }

        public int getRtu_sn() {
            return rtu_sn;
        }

        public void setRtu_sn(int rtu_sn) {
            this.rtu_sn = rtu_sn;
        }

        public long getRtu_time() {
            return rtu_time;
        }

        public void setRtu_time(long rtu_time) {
            this.rtu_time = rtu_time;
        }

        public long getFarm_id() {
            return farm_id;
        }

        public void setFarm_id(long farm_id) {
            this.farm_id = farm_id;
        }

        public long getReg_time() {
            return reg_time;
        }

        public void setReg_time(long reg_time) {
            this.reg_time = reg_time;
        }

        public int getRtu_addr() {
            return rtu_addr;
        }

        public void setRtu_addr(int rtu_addr) {
            this.rtu_addr = rtu_addr;
        }

        public int getRtu_state() {
            return rtu_state;
        }

        public void setRtu_state(int rtu_state) {
            this.rtu_state = rtu_state;
        }
    }
}