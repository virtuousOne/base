package com.base.my_java.myLambda;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/9 15:53
 * Description: 无参数和返回值的lambda
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        invokCook(() -> {
            System.out.println("我是啦啦啦");
        });
    }

    public static void invokCook(Cook cook) {
        cook.make();
    }
}
