package com.base.my_java.myVolatile;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/1 19:32
 * Description:
 */
public class MyTestNumber {
    volatile int i = 1;

    public void addPlus() {
        i++;
    }

    volatile int a = 0;

    public void add1() {
        this.a = a + 1;
    }


    int b = 0;

    public void add2() {
        this.b = b + 1;
    }
}
