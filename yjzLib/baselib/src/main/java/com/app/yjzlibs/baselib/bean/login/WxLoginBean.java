package com.app.yjzlibs.baselib.bean.login;

import java.io.Serializable;

/**
 * Created by yujinzhao on 18/6/1.
 */

public class WxLoginBean implements Serializable{
    /**
     * access_token : 10_9OOzDajT3zd3p35UXn8FYVVIpXfs7iJIHEz-h8dP0XvPAMTY7wVI7rBkobMzqTuKFOgdr80Dg-hACUWRTZUmiufle8sUOWVejdTMIfEUSu4
     * openid : ocBbd0tgD51vL2R6V7oPP7aoj7PY
     */

    private String access_token;
    private String openid;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
