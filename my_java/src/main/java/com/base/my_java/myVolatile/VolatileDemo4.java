package com.base.my_java.myVolatile;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/2 15:36
 * Description: Volatile的应用场景
 */
public class VolatileDemo4 {
    //懒汉模式
    private static volatile VolatileDemo4 instance = null;

    private VolatileDemo4() {
        System.out.println("创建单列模式" + Thread.currentThread().getName());
    }

    //DCL(Double check Lock 双端锁机制)
    public static VolatileDemo4 getInstance() {
        if (instance == null) {
            synchronized (VolatileDemo4.class) {
                if (instance == null) {
                    instance = new VolatileDemo4();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                VolatileDemo4.getInstance();
            }).start();
        }

    }
}
