package com.app.yjzlibs.baselib.bean.map;

/**
 * Created by yujinzhao on 18/4/25.
 */

public class MapPoints {

//    {
//        "point_id": 1,
//            "farm_id": 1,
//            "point_name": "水泵",
//            "point_type": 1, //点类型 1泵 2仪器 3监控
//            "data_id": 2,
//            "point_data": "1499,1383"
//    }

    public static final Long SHUI_BEANG = 1L;
    public static final Long YI_QI = 2L;
    public static final Long JIAN_KONG = 3L;

    public long point_id;
    public long farm_id;
    public String point_name;
    public int point_type;
    public long data_id;
    public String point_data;

//    public PointF getPointF(float scale) {
//        return PathUtil.pathCenter(scale, point_data);
//    }

}
