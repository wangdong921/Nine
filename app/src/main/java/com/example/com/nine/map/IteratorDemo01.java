package com.example.com.nine.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by 汪栋 on 2016/7/29.
 */
public class IteratorDemo01 {
    public static void main(String args[]){
        Map<String,String> map = new HashMap<String,String>();
        map.put("wang","ag");
        map.put("wang1","ag");
        map.put("wang2","ag");

        Set<Map.Entry<String,String>> allSet = map.entrySet();

        Iterator<Map.Entry<String,String>> iterator = allSet.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> me = iterator.next();
            System.out.println(me.getKey() + "--->"+ me.getValue());
        }

    }


}
