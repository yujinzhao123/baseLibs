package com.app.yjzlibs.baselib.bean.device_manage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yujinzhao on 18/5/28.
 */

public class DeviceDetailBean {

    /**
     * instruments : [{"channel_id":3,"channel_name":"实时流量通道","instrument_id":0,"instrument_order":0,"instrument_type_id":0,"instrument_name":""},{"channel_id":4,"channel_name":"压力通道","instrument_id":9,"instrument_order":0,"instrument_type_id":2,"instrument_name":"实时压力表"},{"channel_id":5,"channel_name":"流量通道","instrument_id":10,"instrument_order":0,"instrument_type_id":3,"instrument_name":"流量表"}]
     * relays : [{"channel_id":1,"channel_name":"继电器通道1","relays_id":1,"farmland_id":1,"relays_name":"水泵","relays_order":0,"relays_type":1,"relays_output":10},{"channel_id":2,"channel_name":"继电器通道2","relays_id":0,"farmland_id":0,"relays_name":"","relays_order":0,"relays_type":0,"relays_output":0}]
     * rtu : {"rtu_id":1,"rtu_type":1,"rtu_name":"RTU1","rtu_sn":2100625601,"rtu_time":1523462400,"farm_id":1,"reg_time":1523462400,"rtu_addr":2,"rtu_state":2}
     */

    private RtuBean rtu;
    private List<InstrumentsBean> instruments;
    private List<RelaysBean> relays;

    public RtuBean getRtu() {
        return rtu;
    }

    public void setRtu(RtuBean rtu) {
        this.rtu = rtu;
    }

    public List<InstrumentsBean> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<InstrumentsBean> instruments) {
        this.instruments = instruments;
    }

    public List<RelaysBean> getRelays() {
        return relays;
    }

    public void setRelays(List<RelaysBean> relays) {
        this.relays = relays;
    }

    public static class RtuBean {
        /**
         * rtu_id : 1
         * rtu_type : 1
         * rtu_name : RTU1
         * rtu_sn : 2100625601
         * rtu_time : 1523462400
         * farm_id : 1
         * reg_time : 1523462400
         * rtu_addr : 2
         * rtu_state : 2
         */

        private long rtu_id;
        private int rtu_type;
        private String rtu_name;
        private long rtu_sn;
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

        public long getRtu_sn() {
            return rtu_sn;
        }

        public void setRtu_sn(long rtu_sn) {
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

    public static class InstrumentsBean implements Serializable{
        /**
         * channel_id : 3
         * channel_name : 实时流量通道
         * instrument_id : 0
         * instrument_order : 0
         * instrument_type_id : 0
         * instrument_name :
         */

        private long channel_id;
        private String channel_name;
        private long instrument_id;
        private int instrument_order;
        private int instrument_type_id;
        private String instrument_name;

        public long getChannel_id() {
            return channel_id;
        }

        public void setChannel_id(long channel_id) {
            this.channel_id = channel_id;
        }

        public String getChannel_name() {
            return channel_name;
        }

        public void setChannel_name(String channel_name) {
            this.channel_name = channel_name;
        }

        public long getInstrument_id() {
            return instrument_id;
        }

        public void setInstrument_id(long instrument_id) {
            this.instrument_id = instrument_id;
        }

        public int getInstrument_order() {
            return instrument_order;
        }

        public void setInstrument_order(int instrument_order) {
            this.instrument_order = instrument_order;
        }

        public int getInstrument_type_id() {
            return instrument_type_id;
        }

        public void setInstrument_type_id(int instrument_type_id) {
            this.instrument_type_id = instrument_type_id;
        }

        public String getInstrument_name() {
            return instrument_name;
        }

        public void setInstrument_name(String instrument_name) {
            this.instrument_name = instrument_name;
        }
    }

    public static class RelaysBean implements Serializable{
        /**
         * channel_id : 1
         * channel_name : 继电器通道1
         * relays_id : 1
         * farmland_id : 1
         * relays_name : 水泵
         * relays_order : 0
         * relays_type : 1
         * relays_output : 10
         */

        private long channel_id;
        private String channel_name;
        private long relays_id;
        private long farmland_id;
        private String relays_name;
        private int relays_order;
        private int relays_type;
        private float relays_output;
        private long ins_flow_id;

        public long getIns_flow_id() {
            return ins_flow_id;
        }

        public void setIns_flow_id(long ins_flow_id) {
            this.ins_flow_id = ins_flow_id;
        }

        public long getChannel_id() {
            return channel_id;
        }

        public void setChannel_id(long channel_id) {
            this.channel_id = channel_id;
        }

        public String getChannel_name() {
            return channel_name;
        }

        public void setChannel_name(String channel_name) {
            this.channel_name = channel_name;
        }

        public long getRelays_id() {
            return relays_id;
        }

        public void setRelays_id(long relays_id) {
            this.relays_id = relays_id;
        }

        public long getFarmland_id() {
            return farmland_id;
        }

        public void setFarmland_id(long farmland_id) {
            this.farmland_id = farmland_id;
        }

        public String getRelays_name() {
            return relays_name;
        }

        public void setRelays_name(String relays_name) {
            this.relays_name = relays_name;
        }

        public int getRelays_order() {
            return relays_order;
        }

        public void setRelays_order(int relays_order) {
            this.relays_order = relays_order;
        }

        public int getRelays_type() {
            return relays_type;
        }

        public void setRelays_type(int relays_type) {
            this.relays_type = relays_type;
        }

        public float getRelays_output() {
            return relays_output;
        }

        public void setRelays_output(float relays_output) {
            this.relays_output = relays_output;
        }
    }
}
