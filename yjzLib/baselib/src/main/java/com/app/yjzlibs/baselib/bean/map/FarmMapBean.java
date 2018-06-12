package com.app.yjzlibs.baselib.bean.map;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by yujinzhao on 18/4/25.
 */

@Entity
public class FarmMapBean {
    @Id(autoincrement = false)
    public Long farm_id;
    public String areas;
    public String map;
    public String points;
    public Long time;
    @Generated(hash = 415279262)
    public FarmMapBean(Long farm_id, String areas, String map, String points, Long time) {
        this.farm_id = farm_id;
        this.areas = areas;
        this.map = map;
        this.points = points;
        this.time = time;
    }
    @Generated(hash = 1594171775)
    public FarmMapBean() {
    }
    public Long getFarm_id() {
        return this.farm_id;
    }
    public void setFarm_id(Long farm_id) {
        this.farm_id = farm_id;
    }
    public String getAreas() {
        return this.areas;
    }
    public void setAreas(String areas) {
        this.areas = areas;
    }
    public String getMap() {
        return this.map;
    }
    public void setMap(String map) {
        this.map = map;
    }
    public String getPoints() {
        return this.points;
    }
    public void setPoints(String points) {
        this.points = points;
    }
    public Long getTime() {
        return this.time;
    }
    public void setTime(Long time) {
        this.time = time;
    }










    
}
