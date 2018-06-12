package com.app.yjzlibs.baselib.bean.device_manage;

/**
 * Created by yujinzhao on 18/5/29.
 *
 * 仪器类型对象
 */

public class InstrumentTypeBean {


    /**
     * instrument_type_id : 1
     * channel_id : 2
     * instrument_type_name : 实时流量表
     * instrument_unit : m3
     * instrument_max : 10000
     * instrument_min : 0
     * instrument_multiple : 0.1
     * special : 4
     * instrument_record_time : -1
     * instrument_collect_time : 1
     */

    private int instrument_type_id;
    private long channel_id;
    private String instrument_type_name;
    private String instrument_unit;
    private int instrument_max;
    private int instrument_min;
    private double instrument_multiple;
    private int special;
    private long instrument_record_time;
    private long instrument_collect_time;


    public String getShowName(){
        return instrument_type_name;
    }

    public int getInstrument_type_id() {
        return instrument_type_id;
    }

    public void setInstrument_type_id(int instrument_type_id) {
        this.instrument_type_id = instrument_type_id;
    }

    public long getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(long channel_id) {
        this.channel_id = channel_id;
    }

    public String getInstrument_type_name() {
        return instrument_type_name;
    }

    public void setInstrument_type_name(String instrument_type_name) {
        this.instrument_type_name = instrument_type_name;
    }

    public String getInstrument_unit() {
        return instrument_unit;
    }

    public void setInstrument_unit(String instrument_unit) {
        this.instrument_unit = instrument_unit;
    }

    public int getInstrument_max() {
        return instrument_max;
    }

    public void setInstrument_max(int instrument_max) {
        this.instrument_max = instrument_max;
    }

    public int getInstrument_min() {
        return instrument_min;
    }

    public void setInstrument_min(int instrument_min) {
        this.instrument_min = instrument_min;
    }

    public double getInstrument_multiple() {
        return instrument_multiple;
    }

    public void setInstrument_multiple(double instrument_multiple) {
        this.instrument_multiple = instrument_multiple;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public long getInstrument_record_time() {
        return instrument_record_time;
    }

    public void setInstrument_record_time(long instrument_record_time) {
        this.instrument_record_time = instrument_record_time;
    }

    public long getInstrument_collect_time() {
        return instrument_collect_time;
    }

    public void setInstrument_collect_time(long instrument_collect_time) {
        this.instrument_collect_time = instrument_collect_time;
    }
}
