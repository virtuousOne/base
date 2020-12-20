package com.base.my_java.myLambda;

import java.util.function.Predicate;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/10 17:16
 * Description: Predicate接口：
 * 介绍：对某种数据的数据类型进行判断，结果返回boolean类型
 * boolean test(T t)： 符合返回true；不符合返回false
 */
public class FunctionDemo8 {
    public static boolean test(String name, Predicate<String> pre) {
        return pre.test(name);
    }

    public static void main(String[] args) {
        String message = "abcedef";
        Boolean b = test(message, (s) -> {
            return s.length() > 5;
        });
        System.out.println(b);
    }
}
