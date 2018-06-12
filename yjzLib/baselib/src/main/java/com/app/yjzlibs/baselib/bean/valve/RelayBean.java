package com.app.yjzlibs.baselib.bean.valve;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by yujinzhao on 18/4/23.
 */


@Entity
public class RelayBean {

//    {
//        "relays_id": 1,
//            "farm_id": 1,
//            "relays_name": "阀门",
//            "relays_order": 0,
//            "relays_type": 1,//1水泵 2施肥泵 3阀门 中间图标类型 1和2是泵图标 3是阀门图标
//            "rtu_id": 1,
//            "channel_id": 1,
//            "farmland_id": 1, //灌溉组ID
//            "farmland_name":"灌溉组1",
//            "relays_pressure": 0,//压力值 float
//            "relays_voltage": 0,//电压值 int 1-100%
//            "start_time": 0, //开始时间 timestamp
//            "end_time": 0, //预计关闭时间 timestamp  暂时不用
//            "relays_output": 10, //出水量
//            "relays_state": 2//继电器状态  1是关闭 2是开启 3是故障  1-2(4)  2-1(5) 3-2(6)
//    }

    @Id(autoincrement = false)
    public long relays_id;
    public long farm_id;
    public String relays_name;
    public int relays_order;
    public int relays_type;
    public int rtu_id;
    public int channel_id;
    public int farmland_id;
    public String farmland_name;
    public float relays_pressure;
    public int relays_voltage;
    public long start_time;
    public long end_time;
    public float last_irrigation;
    public int relays_state;
    public float relays_output;
    @Generated(hash = 747924583)
    public RelayBean(long relays_id, long farm_id, String relays_name,
            int relays_order, int relays_type, int rtu_id, int channel_id,
            int farmland_id, String farmland_name, float relays_pressure,
            int relays_voltage, long start_time, long end_time,
            float last_irrigation, int relays_state, float relays_output) {
        this.relays_id = relays_id;
        this.farm_id = farm_id;
        this.relays_name = relays_name;
        this.relays_order = relays_order;
        this.relays_type = relays_type;
        this.rtu_id = rtu_id;
        this.channel_id = channel_id;
        this.farmland_id = farmland_id;
        this.farmland_name = farmland_name;
        this.relays_pressure = relays_pressure;
        this.relays_voltage = relays_voltage;
        this.start_time = start_time;
        this.end_time = end_time;
        this.last_irrigation = last_irrigation;
        this.relays_state = relays_state;
        this.relays_output = relays_output;
    }
    @Generated(hash = 1390949853)
    public RelayBean() {
    }
    public long getRelays_id() {
        return this.relays_id;
    }
    public void setRelays_id(long relays_id) {
        this.relays_id = relays_id;
    }
    public long getFarm_id() {
        return this.farm_id;
    }
    public void setFarm_id(long farm_id) {
        this.farm_id = farm_id;
    }
    public String getRelays_name() {
        return this.relays_name;
    }
    public void setRelays_name(String relays_name) {
        this.relays_name = relays_name;
    }
    public int getRelays_order() {
        return this.relays_order;
    }
    public void setRelays_order(int relays_order) {
        this.relays_order = relays_order;
    }
    public int getRelays_type() {
        return this.relays_type;
    }
    public void setRelays_type(int relays_type) {
        this.relays_type = relays_type;
    }
    public int getRtu_id() {
        return this.rtu_id;
    }
    public void setRtu_id(int rtu_id) {
        this.rtu_id = rtu_id;
    }
    public int getChannel_id() {
        return this.channel_id;
    }
    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }
    public int getFarmland_id() {
        return this.farmland_id;
    }
    public void setFarmland_id(int farmland_id) {
        this.farmland_id = farmland_id;
    }
    public String getFarmland_name() {
        return this.farmland_name;
    }
    public void setFarmland_name(String farmland_name) {
        this.farmland_name = farmland_name;
    }
    public float getRelays_pressure() {
        return this.relays_pressure;
    }
    public void setRelays_pressure(float relays_pressure) {
        this.relays_pressure = relays_pressure;
    }
    public int getRelays_voltage() {
        return this.relays_voltage;
    }
    public void setRelays_voltage(int relays_voltage) {
        this.relays_voltage = relays_voltage;
    }
    public long getStart_time() {
        return this.start_time;
    }
    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }
    public long getEnd_time() {
        return this.end_time;
    }
    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }
    public float getLast_irrigation() {
        return this.last_irrigation;
    }
    public void setLast_irrigation(float last_irrigation) {
        this.last_irrigation = last_irrigation;
    }
    public int getRelays_state() {
        return this.relays_state;
    }
    public void setRelays_state(int relays_state) {
        this.relays_state = relays_state;
    }
    public float getRelays_output() {
        return this.relays_output;
    }
    public void setRelays_output(float relays_output) {
        this.relays_output = relays_output;
    }


}
