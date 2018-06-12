package com.app.yjzlibs.baselib.bean;

import java.util.List;

/**
 * Created by yujinzhao on 18/5/15.
 */

public class ChartBean {


    /**
     * stats : [{"time":1525737600,"value":1286.9993026256561},{"time":1525824000,"value":840.9999008178711},{"time":1525910400,"value":1697.0006360635161},{"time":1525996800,"value":1430.9993038475513},{"time":1526083200,"value":1439.9986267089844},{"time":1526169600,"value":141.99988555908203}]
     * time : 1525737600
     */

    public String unit;
    private int time;
    private List<StatsBean> stats;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<StatsBean> getStats() {
        return stats;
    }

    public void setStats(List<StatsBean> stats) {
        this.stats = stats;
    }

    public static class StatsBean {
        /**
         * time : 1525737600
         * value : 1286.9993026256561
         */

        private int time;
        private double value;

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }
    }
}
