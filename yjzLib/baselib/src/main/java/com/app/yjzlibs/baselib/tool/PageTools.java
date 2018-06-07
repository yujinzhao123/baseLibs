package com.app.yjzlibs.baselib.tool;

/**
 * Created by yujinzhao on 18/5/24.
 */

public class PageTools {
    private int offset = 0;

    public void loadOk(int offset) {

        this.offset = offset;

    }

    public int getOffset() {
        return offset;
    }

    public int getFirstOffset() {
        offset = 0;
        return offset;
    }

    public void clean() {
        offset = 0;
    }
}
