package com.app.yjzlibs.baselib.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.app.yjzlibs.baselib.tool.SelectpictureUtil;
import com.app.yjzlibs.baselib.tool.status_bar.StatusBarUtil;

import java.util.ArrayList;

/**
 * Created by yujinzhao on 18/6/7.
 */

public class BaseActivity extends AppCompatActivity{
    public void setPictureCallBack(PictureCallBack pictureCallBack) {
        this.pictureCallBack = pictureCallBack;
    }

    private PictureCallBack pictureCallBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        initProgressDialog();

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    protected ProgressDialog progressDialog;
    private void initProgressDialog() {
        progressDialog = new ProgressDialog(this);//1.创建一个ProgressDialog的实例
        progressDialog.setTitle("");//2.设置标题
        progressDialog.setMessage("正在加载中，请稍等......");//3.设置显示内容
        progressDialog.setCancelable(true);//4.设置可否用back键关闭对话框
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SelectpictureUtil.REQUEST_PICK) {//图片选择的回调
            if (data != null) {
                ArrayList<String> img_list = new ArrayList<String>();
                img_list = SelectpictureUtil.getfilepath(data);
                if (pictureCallBack != null) {
                    pictureCallBack.callBack(img_list);
                }
            }
        }
    }
    public interface PictureCallBack {
        void callBack(ArrayList<String> paths);
    }

    public void setWhiteMode(){
        StatusBarUtil.setImmersiveStatusBar(this,true);
    }
}
