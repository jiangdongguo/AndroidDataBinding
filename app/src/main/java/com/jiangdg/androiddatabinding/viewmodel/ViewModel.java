package com.jiangdg.androiddatabinding.viewmodel;

import android.content.Context;
import android.widget.Toast;

/** ViewModel父类，抽出一些公共方法
 *
 * Created by jianddongguo on 2017/9/15.
 */

public class ViewModel {

    protected void showMsg(Context context, String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }

}
