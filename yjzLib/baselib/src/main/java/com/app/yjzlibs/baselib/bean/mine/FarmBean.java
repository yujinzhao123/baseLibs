package com.app.yjzlibs.baselib.bean.mine;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by yujinzhao on 18/5/7.
 *
 * 选择农场的对象
 */

@Entity
public class FarmBean {

    /**
     * farm_id : 1
     * type : 1\\1最高权限 2是部分权限
     * state : 1
     * farm_name : 测试2
     * farm_addr : 地理位置
     * farm_coordinate : 111,111
     * farm_reg_time : 0
     * farm_effective_time : 1577808000
     * farm_state : 1
     */

    public int isSelect;//0未选择1选择
    @Id(autoincrement = false)
    public long farm_id;
    public int type;
    public int state;
    public String farm_name;
    public String farm_addr;
    public String farm_coordinate;
    public long farm_reg_time;
    public long farm_effective_time;
    public int farm_state;
    @Generated(hash = 1656402723)
    public FarmBean(int isSelect, long farm_id, int type, int state,
            String farm_name, String farm_addr, String farm_coordinate,
            long farm_reg_time, long farm_effective_time, int farm_state) {
        this.isSelect = isSelect;
        this.farm_id = farm_id;
        this.type = type;
        this.state = state;
        this.farm_name = farm_name;
        this.farm_addr = farm_addr;
        this.farm_coordinate = farm_coordinate;
        this.farm_reg_time = farm_reg_time;
        this.farm_effective_time = farm_effective_time;
        this.farm_state = farm_state;
    }
    @Generated(hash = 989176295)
    public FarmBean() {
    }
    public int getIsSelect() {
        return this.isSelect;
    }
    public void setIsSelect(int isSelect) {
        this.isSelect = isSelect;
    }
    public long getFarm_id() {
        return this.farm_id;
    }
    public void setFarm_id(long farm_id) {
        this.farm_id = farm_id;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getState() {
        return this.state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getFarm_name() {
        return this.farm_name;
    }
    public void setFarm_name(String farm_name) {
        this.farm_name = farm_name;
    }
    public String getFarm_addr() {
        return this.farm_addr;
    }
    public void setFarm_addr(String farm_addr) {
        this.farm_addr = farm_addr;
    }
    public String getFarm_coordinate() {
        return this.farm_coordinate;
    }
    public void setFarm_coordinate(String farm_coordinate) {
        this.farm_coordinate = farm_coordinate;
    }
    public long getFarm_reg_time() {
        return this.farm_reg_time;
    }
    public void setFarm_reg_time(long farm_reg_time) {
        this.farm_reg_time = farm_reg_time;
    }
    public long getFarm_effective_time() {
        return this.farm_effective_time;
    }
    public void setFarm_effective_time(long farm_effective_time) {
        this.farm_effective_time = farm_effective_time;
    }
    public int getFarm_state() {
        return this.farm_state;
    }
    public void setFarm_state(int farm_state) {
        this.farm_state = farm_state;
    }



}
