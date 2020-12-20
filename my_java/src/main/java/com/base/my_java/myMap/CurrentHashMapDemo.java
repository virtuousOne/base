package com.base.my_java.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 吴宸煊
 * Date: 2020/11/21 16:58
 * Description:
 */
public class CurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("key","value");
        System.out.println(concurrentHashMap.get("key"));


        Map<String,String> map = new HashMap<>();
        map.put("key","value");
        System.out.println(map.get("key"));

    }
}
