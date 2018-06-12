package com.app.yjzlibs.baselib.bean.status;

import java.util.List;

/**
 * Created by yujinzhao on 18/5/17.
 */

public class Meteorological {

    /**
     * element : [{"id":1,"name":"温度","value":"23.4","unit":"℃"},{"id":2,"name":"湿度","value":"79.1","unit":"%"},{"id":4,"name":"雨量","value":"0.0","unit":"mm"},{"id":8,"name":"风速","value":"1.1","unit":"m/s"},{"id":9,"name":"风向","value":"248","unit":"°"},{"id":12,"name":"照度","value":"2620","unit":"Lx"}]
     * id : 1
     * name : 眉山欧阳键
     * position : 102.89916,30.367481
     * time : 1526521275
     */

    private int id;
    private String name;
    private String position;
    private long time;
    private List<WeatherConditionBean> element;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<WeatherConditionBean> getElement() {
        return element;
    }

    public void setElement(List<WeatherConditionBean> element) {
        this.element = element;
    }


}
