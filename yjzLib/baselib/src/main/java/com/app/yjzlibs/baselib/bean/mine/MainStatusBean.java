package com.app.yjzlibs.baselib.bean.mine;

import java.util.List;

/**
 * Created by yujinzhao on 18/5/11.
 */

public class MainStatusBean {

    /**
     * chart : [{"name":"实时流量","value":35.599998474121094,"max":200,"min":0},{"name":"实时压力表","value":32.7,"max":100,"min":0}]
     * daily : 182.00002379715443
     * et : -
     * farm : {"farm_id":1,"farm_name":"测试2","farm_contcat_name":"张三","farm_contcat_phone":"13888888888","farm_addr":"地理位置","farm_coordinate":"111,111","farm_reg_time":0,"farm_effective_time":1577808000,"max_traffic":200,"farm_weather":1,"farm_state":1}
     * online : true
     * total_flow : 8656245
     */

    public float daily;
    public String et;
    public FarmBean farm;
    public boolean online;
    public int total_flow;
    public List<ChartBean> chart;



    public static class FarmBean {
        /**
         * farm_id : 1
         * farm_name : 测试2
         * farm_contcat_name : 张三
         * farm_contcat_phone : 13888888888
         * farm_addr : 地理位置
         * farm_coordinate : 111,111
         * farm_reg_time : 0
         * farm_effective_time : 1577808000
         * max_traffic : 200
         * farm_weather : 1
         * farm_state : 1
         */

        public long farm_id;
        public String farm_name;
        public String farm_contcat_name;
        public String farm_contcat_phone;
        public String farm_addr;
        public String farm_coordinate;
        public long farm_reg_time;
        public long farm_effective_time;
        public int max_traffic;
        /**
         * 天气界面请求数据的node_id
         */
        public int farm_weather;
        public int farm_state;


    }

    public static class ChartBean {
        /**
         * name : 实时流量
         * value : 35.599998474121094
         * max : 200
         * min : 0
         */

        public String unit;
        public String name;
        public float value;
        public int max;
        public int min;


    }
}
