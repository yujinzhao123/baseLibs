package com.app.yjzlibs.baselib.bean.http;

import android.view.View;

import java.io.File;

import cn.greenhn.android_pad.http.FileProgress;


/**
 * Created by yujinzhao on 16/10/28.
 */

public class RxFile implements FileProgress {

    @Override
    public void progress(float vlue) {

    }

    public File file;

    public View view;
}
