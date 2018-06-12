package com.app.yjzlibs.baselib.bean;

import java.util.List;

/**
 * Created by yujinzhao on 18/5/15.
 */

public class H5CharBean {

    /**
     * D : {"currentIndex":0,"barData":[20,40,50,30,10,100,40],"xAxisData":["11","12","13","14","15","16","17"],"lineTime":["日","一","二","三","四","五","六"],"unit":"D"}
     * W : {"currentIndex":0,"barData":[30,40,50,30,10,100,40],"xAxisData":["11","12","13","14","15","16","17"],"lineTime":[],"unit":"W"}
     * M : {"currentIndex":0,"barData":[60,40,50,30,10,100,40],"xAxisData":["11","12","13","14","15","16","17"],"lineTime":[],"unit":"M"}
     */

    private DBean D;
    private DBean W;
    private DBean M;

    public DBean getD() {
        return D;
    }

    public void setD(DBean D) {
        this.D = D;
    }

    public DBean getW() {
        return W;
    }

    public void setW(DBean W) {
        this.W = W;
    }

    public DBean getM() {
        return M;
    }

    public void setM(DBean M) {
        this.M = M;
    }

    public static class DBean {
        /**
         * currentIndex : 0
         * barData : [20,40,50,30,10,100,40]
         * xAxisData : ["11","12","13","14","15","16","17"]
         * lineTime : ["日","一","二","三","四","五","六"]
         * unit : D
         */

        private int currentIndex;
        private String unit;
        private List<Integer> barData;
        private List<String> xAxisData;
        private List<String> lineTime;

        public int getCurrentIndex() {
            return currentIndex;
        }

        public void setCurrentIndex(int currentIndex) {
            this.currentIndex = currentIndex;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public List<Integer> getBarData() {
            return barData;
        }

        public void setBarData(List<Integer> barData) {
            this.barData = barData;
        }

        public List<String> getXAxisData() {
            return xAxisData;
        }

        public void setXAxisData(List<String> xAxisData) {
            this.xAxisData = xAxisData;
        }

        public List<String> getLineTime() {
            return lineTime;
        }

        public void setLineTime(List<String> lineTime) {
            this.lineTime = lineTime;
        }
    }


}
