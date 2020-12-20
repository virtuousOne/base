package com.base.my_java.myLambda;

import java.util.function.Predicate;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/10 19:01
 * Description: Predicate接口的 or方法
 */
public class FunctionDemo10 {
    public static boolean test(String name, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.or(pre2).test(name);
    }

    public static void main(String[] args) {
        String message = "abc";
        Boolean b = test(message, (str) -> {
            return str.length() > 5;
        }, (str) -> {
            return str.contains("a");
        });
        System.out.println(b);
    }
}
