package com.base.my_java.myStream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/11 15:30
 * Description: 获取Stream流的方式
 * 1：所有的Collection集合可以通过stream()方法获取流
 * 2. Stream接口的静态方法of 可以获取数组对应的流
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        //把集合转换为Stream流

        //1.List集合
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        //2.Set集合
        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();
        //3.Map集合
        Map<String, String> map = new HashMap<>();
        // 存储key
        Set<String> set1 = map.keySet();
        Stream<String> stream2 = set1.stream();
        // 存款值value
        Collection<String> stringSet = map.values();
        Stream<String> stream3 = stringSet.stream();
        //根据EntrySet存储
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();


        //数组转换为Stream流
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Stream<Integer> stream5 = Stream.of(arr);

        //字符串数组
        String[] arr1 = {"a", "b", "c"};
        Stream<String> stream6 = Stream.of(arr1);


    }
}
