package com.base.my_java.myLambda;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/9 19:26
 * Description:
 */
public class FunctionDemo2 {
    public static void cwu(FunctionDemo1 functionDemo1) {
        functionDemo1.test();
    }

    public static void main(String[] args) {
        cwu(() -> {
            System.out.println("开始使用函数式接口编程");
        });
    }
}
