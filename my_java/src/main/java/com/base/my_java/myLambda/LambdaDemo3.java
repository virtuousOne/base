package com.base.my_java.myLambda;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/9 16:25
 * Description: 有参数有返回值
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        invokAdd(1, 5, (int a, int b) -> {
            return a + b;
        });

    }

    public static void invokAdd(int a, int b, Calculator c) {
        int sum = a + b;
        System.out.println(sum);

    }
}
