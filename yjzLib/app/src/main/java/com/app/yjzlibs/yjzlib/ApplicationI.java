package com.app.yjzlibs.yjzlib;

import com.app.yjzlibs.baselib.BaseApplication;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/**
 * Created by yujinzhao on 18/6/7.
 */

public class ApplicationI extends BaseApplication{

    @Override
    public void onCreate() {
        super.onCreate();
    }
    private void initLogger() {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder().showThreadInfo(false).tag("gnpad").build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy) {
            public boolean isLoggable(int priority, String tag) {
                return false;
            }
        });
    }
}
