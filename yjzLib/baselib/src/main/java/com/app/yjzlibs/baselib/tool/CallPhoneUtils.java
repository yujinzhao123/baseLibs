package com.app.yjzlibs.baselib.tool;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by yujinzhao on 18/5/28.
 */

public class CallPhoneUtils {


    public static void  call(String nub, Context context){
        Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+nub));
        context.startActivity(i);
    }
}
