package com.app.yjzlibs.baselib.bean.status;

/**
 * Created by yujinzhao on 18/4/18.
 */


/**
 * 气象中显示【湿度，雨量。。。】bean
 */
public class WeatherConditionBean {


    /**
     * Id : 1
     * Name : 温度
     * Value : 22.3℃
     */

    private int Id;
    private String Name;
    private String Value;
    private String unit;

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {

        return unit;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

}
