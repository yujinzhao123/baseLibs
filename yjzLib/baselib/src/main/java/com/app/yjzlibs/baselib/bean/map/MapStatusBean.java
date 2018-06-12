package com.app.yjzlibs.baselib.bean.map;

import android.graphics.PointF;

import com.blankj.utilcode.util.SPUtils;

import java.io.Serializable;

/**
 * Created by yujinzhao on 18/5/14.
 */

public class MapStatusBean implements Serializable {

    public static final String MAP_SIZE = "MAP_SIZE";
    public static final String MAP_CENT = "MAP_CENT";
    public static final String MAP_ID = "MAP_ID";

    public static float size = -1f;
    public static PointF centP = null;
    public static long mapId = -1;

    public static void init() {
        size = SPUtils.getInstance().getFloat(MAP_SIZE, -1f);
        centP = sp2cent();
        mapId = SPUtils.getInstance().getLong(MAP_ID,-1l);
    }

    private static PointF sp2cent() {
        try {
            String str = SPUtils.getInstance().getString(MAP_CENT);
            String[] data = str.split(",");
            return new PointF(Float.parseFloat(data[0]), Float.parseFloat(data[1]));
        } catch (Exception e) {

        }
        return null;
    }
//
//
//    /**
//     * 必须在map调用setRelation前
//     *
//     * @param mapView
//     */
//    public static void setMapStatus(MyMapView mapView) {
//        if (MapStatusBean.centP != null && mapView.size != -1) {
//            mapView.setCenterP(centP);
//            mapView.size = size;
//        }
//    }
//
//    public static void save(MyMapView mapView) {
//        if (mapView == null) {
//            return;
//        }
//        MapStatusBean.size = mapView.size;
//        MapStatusBean.centP = mapView.getCenterP();
//        SPUtils.getInstance().put(MAP_SIZE, size);
//        SPUtils.getInstance().put(MAP_CENT, centP.x + "," + centP.y);
//    }
//
    public static void clean() {

        MapStatusBean.size = -1f;
        MapStatusBean.centP = null;
        MapStatusBean.mapId = -1l;

        SPUtils.getInstance().put(MAP_SIZE, -1f);
        SPUtils.getInstance().put(MAP_CENT, "");
        SPUtils.getInstance().put(MAP_ID,mapId);
    }

    public static void save(final long mapId, final float size, PointF centerP) {
        MapStatusBean.size = size;
        MapStatusBean.centP = centerP;
        MapStatusBean.mapId = mapId;
        new Thread(new Runnable() {
            @Override
            public void run() {
                SPUtils.getInstance().put(MAP_SIZE,size);
                SPUtils.getInstance().put(MAP_ID,mapId);
                SPUtils.getInstance().put(MAP_CENT, centP.x + "," + centP.y);
            }
        }).start();
    }
//

}
