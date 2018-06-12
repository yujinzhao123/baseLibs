package com.app.yjzlibs.baselib.bean.device_manage;

/**
 * Created by yujinzhao on 18/5/29.
 */

public class TotalFlowBean {

    /**
     * instrument_id : 10
     * channel_id : 5
     * instrument_order : 0
     * instrument_type_id : 3
     * instrument_name : 流量表
     */

    private long instrument_id;
    private long channel_id;
    private int instrument_order;
    private int instrument_type_id;
    private String instrument_name;

    public String getShowName() {
        return instrument_name;
    }

    public long getInstrument_id() {
        return instrument_id;
    }

    public void setInstrument_id(long instrument_id) {
        this.instrument_id = instrument_id;
    }

    public long getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(long channel_id) {
        this.channel_id = channel_id;
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
