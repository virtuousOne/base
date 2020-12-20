package com.base.my_java.myVolatile;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/1 11:40
 * Description: 有volatile修饰的有可见性
 */
public class VolatileDemo2 {

    public static void main(String[] args) {
        MyTestNumber myName = new MyTestNumber();
        // 线程1
        new Thread(() -> {
            System.out.println("获取该线程的名字:" + Thread.currentThread().getName() + "  a的值:" + myName.a);
            try {
                // 故意停顿5秒
                Thread.sleep(5000);
                myName.add1();
                System.out.println("输出该线程的名字:" + Thread.currentThread().getName() + "  更新后a的值:" + myName.a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("输出该线程的名字:" + Thread.currentThread().getName() + "  a的值:" + myName.a);
        }, "线程1").start();

        // 线程2
        new Thread(() -> {
            while (myName.a == 0) {
                // 一直等待，直到值改变为止
            }
            System.out.println("volatile修饰的有可见性，不再进入死循环");
            System.out.println("输出该线程的名字:" + Thread.currentThread().getName() + "  a的值:" + myName.a);
        }, "线程2").start();


    }


}

