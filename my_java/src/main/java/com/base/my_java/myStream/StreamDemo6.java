package com.base.my_java.myStream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/11 20:14
 * Description:Count方法
 * Stream流中的Count方法：用于统计Stream流中元素的个数
 * 返回值是一个long类型的整数
 */
public class StreamDemo6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(15);
        list.add(20);
        list.add(30);
        Long a = list.stream().count();
        System.out.println(a);
    }
}
