package com.example.com.nine;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by 汪栋 on 2016/7/26.
 */
public class Utils {
    private static Toast toast;
    public static void showToast(Context context,String content){

        if (toast == null){
            toast = Toast.makeText(context,content,Toast.LENGTH_SHORT);
        }else {
            toast.setText(content);
        }

        toast.show();
    }
}
