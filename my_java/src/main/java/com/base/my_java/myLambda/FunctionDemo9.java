package com.base.my_java.myLambda;

import java.util.function.Predicate;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/10 18:42
 * Description: Predicate接口的 and方法
 */
public class FunctionDemo9 {
    public static boolean test(String name, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(name);
    }

    public static void main(String[] args) {
        String message = "abcdedf";
        Boolean b = test(message, (str) -> {
            return str.length() > 5;
        }, (str) -> {
            return str.contains("a");
        });
        System.out.println(b);
    }
}
