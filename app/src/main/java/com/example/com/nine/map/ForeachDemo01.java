package com.example.com.nine.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 汪栋 on 2016/7/29.
 */
public class ForeachDemo01 {
    public static void main(String args[]){
        Map<String,String> map = new HashMap<String,String>();

        map.put("wang","ag");
        map.put("wang1","ag");
        map.put("wang2","ag");

        for (Map.Entry<String,String> me: map.entrySet()) {
            System.out.println(me.getKey() + "--->" + me.getValue());
        }

    }
}
