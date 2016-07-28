package com.example.com.nine.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 汪栋 on 2016/7/29.
 */
public class HashMapDemo01 {
    public static void main(String args[]){
        Map<String,String> map = null;
        map = new HashMap<String,String>();

        map.put("wang","dong");
        map.put("jia","you");
        map.put("cheng","gong");

        String val = map.get("wang");
        System.out.println("取出的内容为：" + val);
    }

}
