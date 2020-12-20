package com.base.my_java.myLambda;

import java.util.function.Consumer;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/10 15:50
 * Description: 格式化打印信息
 */
public class FunctionDemo7 {
    public static void test(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"张三,男", "李四,女", "王五,男", "赵云,男"};
        test(arr, (message) -> {
            String name = message.split(",")[0];
            System.out.print("姓名:" + name);
        }, (message) -> {
            String sex = message.split(",")[1];
            System.out.println("。性别:" + sex);
        });

    }
}
