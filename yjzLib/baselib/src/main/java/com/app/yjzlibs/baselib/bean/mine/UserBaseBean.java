package com.app.yjzlibs.baselib.bean.mine;

/**
 * Created by yujinzhao on 18/6/2.
 */

public class UserBaseBean {


    /**
     * farm : {"farm_id":1,"type":1,"state":1,"farm_name":"测试2","farm_addr":"地理位置","farm_coordinate":"19.5090960000,110.1351710000","farm_reg_time":0,"farm_effective_time":1577808000,"farm_state":1}
     * user : {"user_id":2,"user_name":"test","user_img":"https://cdn1.greenhn.cn/ganlin/user/2_1526206023.png","user_nickname":"测试用户","user_wx":"odJ4y0oTWfEuBLOdmYFoXE1afJE4","user_type":2,"user_state":1}
     */

    private FarmBean farm;
    private UserBean user;

    public FarmBean getFarm() {
        return farm;
    }

    public void setFarm(FarmBean farm) {
        this.farm = farm;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class FarmBean {
        /**
         * farm_id : 1
         * type : 1
         * state : 1
         * farm_name : 测试2
         * farm_addr : 地理位置
         * farm_coordinate : 19.5090960000,110.1351710000
         * farm_reg_time : 0
         * farm_effective_time : 1577808000
         * farm_state : 1
         */

        private long farm_id;
        private int type;
        private int state;
        private String farm_name;
        private String farm_addr;
        private String farm_coordinate;
        private int farm_reg_time;
        private int farm_effective_time;
        private int farm_state;

        public long getFarm_id() {
            return farm_id;
        }

        public void setFarm_id(long farm_id) {
            this.farm_id = farm_id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public String getFarm_name() {
            return farm_name;
        }

        public void setFarm_name(String farm_name) {
            this.farm_name = farm_name;
        }

        public String getFarm_addr() {
            return farm_addr;
        }

        public void setFarm_addr(String farm_addr) {
            this.farm_addr = farm_addr;
        }

        public String getFarm_coordinate() {
            return farm_coordinate;
        }

        public void setFarm_coordinate(String farm_coordinate) {
            this.farm_coordinate = farm_coordinate;
        }

        public int getFarm_reg_time() {
            return farm_reg_time;
        }

        public void setFarm_reg_time(int farm_reg_time) {
            this.farm_reg_time = farm_reg_time;
        }

        public int getFarm_effective_time() {
            return farm_effective_time;
        }

        public void setFarm_effective_time(int farm_effective_time) {
            this.farm_effective_time = farm_effective_time;
        }

        public int getFarm_state() {
            return farm_state;
        }

        public void setFarm_state(int farm_state) {
            this.farm_state = farm_state;
        }
    }

    public static class UserBean {
        /**
         * user_id : 2
         * user_name : test
         * user_img : https://cdn1.greenhn.cn/ganlin/user/2_1526206023.png
         * user_nickname : 测试用户
         * user_wx : odJ4y0oTWfEuBLOdmYFoXE1afJE4
         * user_type : 2
         * user_state : 1
         */

        private long user_id;
        private String user_name;
        private String user_img;
        private String user_nickname;
        private String user_wx;
        private int user_type;
        private int user_state;

        public long getUser_id() {
            return user_id;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getUser_img() {
            return user_img;
        }

        public void setUser_img(String user_img) {
            this.user_img = user_img;
        }

        public String getUser_nickname() {
            return user_nickname;
        }

        public void setUser_nickname(String user_nickname) {
            this.user_nickname = user_nickname;
        }

        public String getUser_wx() {
            return user_wx;
        }

        public void setUser_wx(String user_wx) {
            this.user_wx = user_wx;
        }

        public int getUser_type() {
            return user_type;
        }

        public void setUser_type(int user_type) {
            this.user_type = user_type;
        }

        public int getUser_state() {
            return user_state;
        }

        public void setUser_state(int user_state) {
            this.user_state = user_state;
        }
    }
}
