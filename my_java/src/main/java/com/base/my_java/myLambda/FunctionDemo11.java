package com.base.my_java.myLambda;

import java.util.function.Function;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/10 19:20
 * Description: Function<T,R>接口
 * 介绍：根据一个类型的数据得到另一个类型的数据
 * apply(T t):根据类型T的参数获取R的结果
 */
public class FunctionDemo11 {
    public static void test(String message, Function<String, Integer> a) {
        Integer num = a.apply(message);
        System.out.println(num);
    }

    public static void main(String[] args) {
        String a = "1234";
        test(a, (str) -> {
            return Integer.parseInt(str);
        });
    }
}
