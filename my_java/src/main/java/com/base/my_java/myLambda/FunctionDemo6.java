package com.base.my_java.myLambda;

import java.util.function.Consumer;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/10 15:35
 * Description:  Consumer接口
 * 使用andThen连接消费
 */
public class FunctionDemo6 {
    public static void test(String name, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(name);//con1连接con2进行消费
    }

    public static void main(String[] args) {
        test("HelLo", (a) -> {
            System.out.println(a.toUpperCase());
        }, (a) -> {
            System.out.println(a.toLowerCase());
        });
    }
}
