package com.example.com.nine.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 汪栋 on 2016/7/29.
 */
public class HashMapDemo02 {
    public static void main(String args[]){
        Map<String,String> map = new HashMap<String,String>();

        map.put("wang","dong");


        if (map.containsKey("wang")){
            System.out.println("搜索的Key存在！！");
        }else {
            System.out.println("搜索的Key 不存在！！");
        }



    }
}
