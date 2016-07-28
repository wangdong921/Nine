package com.example.com.nine;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by 汪栋 on 2016/7/27.
 */
public class NetUtils {


    /**
     * 当前网络是否可用
     * @param context
     * @return
     */
    public static boolean isNetworkAvailable(Context context){
        ConnectivityManager cmgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] infos = cmgr.getAllNetworkInfo();
        if (infos !=null){
            for (int i = 0; i <infos.length ; i++) {
                if (infos[i].getState() == NetworkInfo.State.CONNECTED){
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * 网络是否连接
     * @param context
     * @return
     */

    public static boolean isNetworkConnected(Context context){
        if (context !=null){
            ConnectivityManager mConnectivityManaget = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManaget.getActiveNetworkInfo();
            if (mNetworkInfo !=null){
                return mNetworkInfo.isAvailable();
            }
        }

        return false;
    }


    /**
     * 是否是在wifi环境下
     * @param context
     * @return
     */


    public static boolean isWifiConnected(Context context){
        if (context != null){
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mWifiNetworkInfo = mConnectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

            if(mWifiNetworkInfo != null){
                return  mWifiNetworkInfo.isAvailable();
            }
        }
        return false;
    }


    /**
     * 是否在移动数据网络下
     * @param context
     * @return
     */
    public static boolean isMobileConnected(Context context){
        if (context != null){
            ConnectivityManager mConnectivityMananger = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mMobile = mConnectivityMananger.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if (mMobile != null){
                return mMobile.isAvailable();
            }
        }

        return false;
    }



}
