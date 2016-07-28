package com.example.com.nine.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by 汪栋 on 2016/7/29.
 */
public class HashMapDemo03 {
    public static void main(String args[]){
        Map<String,String> map = new HashMap<String,String>();

        map.put("wang","dogn");
        map.put("li","xiang");
        map.put("ha","ah");

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.print(str+"、");
        }

    }
}
