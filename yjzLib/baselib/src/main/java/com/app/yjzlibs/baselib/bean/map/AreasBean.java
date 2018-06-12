package com.app.yjzlibs.baselib.bean.map;

import android.graphics.Path;
import android.graphics.PointF;

import cn.greenhn.android_pad.my_view.map.PathUtil;


/**
 * Created by yujinzhao on 18/4/25.
 */

public class AreasBean {
//    {
//        "area_id": 1,
//            "area_name": "阀门1",
//            "area_data": "1499,1383,1557,1314,1747,1201,2020,1829,1740,1941",
//            "relays_id": 1,
//            "relays_name": "阀门-1",
//            "farmland_id": "1"
//    }

    public long area_id;
    public String area_name;
    public String area_data;
    public long relays_id;
    public String relays_name;
    public long farmland_id;

    public Path getPath(float scale) {
        return PathUtil.stringToPath(area_data, scale);
    }

    public PointF getCenter(float scale, float deviationY) {
        return PathUtil.pathCenter(scale, area_data, deviationY);
    }


}
