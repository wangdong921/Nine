package com.example.com.nine.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by 汪栋 on 2016/7/29.
 */
public class TreeMapDemo01 {
    public static void main(String args[]){
        Map<String,String> map = new TreeMap<String,String>();

        map.put("A:wang","dong");
        map.put("C:li","faf");
        map.put("B:af","affa");

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str +"--->" + map.get(str));
        }

    }

}
