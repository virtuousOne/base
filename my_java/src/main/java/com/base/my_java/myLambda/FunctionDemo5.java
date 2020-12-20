package com.base.my_java.myLambda;

import java.util.function.Consumer;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/10 13:14
 * Description: Consumer接口
 * 介绍：消费一个数据，数据类型由泛型决定
 * Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据
 */
public class FunctionDemo5 {
    public static void test(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void main(String[] args) {
        test("张三", (String name) -> {
            System.out.println(name);
        });
    }
}
