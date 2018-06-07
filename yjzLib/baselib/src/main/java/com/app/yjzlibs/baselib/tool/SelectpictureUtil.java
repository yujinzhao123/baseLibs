package com.app.yjzlibs.baselib.tool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.app.yjzlibs.baselib.activity.SelectPictureActivity;

import java.util.ArrayList;



/**
 * Created by Administrator on 2016/10/25.
 */
public class SelectpictureUtil {
    public static final String INTENT_MAX_NUM = "intent_max_num";
    public static final int REQUEST_PICK = 0;
    public static  void selectClick(Activity activity , ArrayList<String> mlist, int max) {

        Intent intent = new Intent(activity, SelectPictureActivity.class);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("allSelectedPicture", mlist);
        intent.putExtra(INTENT_MAX_NUM,max);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, REQUEST_PICK);
    }
     public static ArrayList<String> getfilepath(Intent intent){
         ArrayList<String> img_list=new ArrayList<String>();
         img_list= (ArrayList<String>) intent.getSerializableExtra(SelectPictureActivity.INTENT_SELECTED_PICTURE);
         return img_list;
     }

}
