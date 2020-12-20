package com.base.my_java.myLock;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/7 19:10
 * Description: 可重入锁
 */
public class ReentrantLock {

    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() -> {
            phone.sendSms();
        }, "t1").start();

        new Thread(() -> {
            phone.sendSms();
        }).start();
    }
}
