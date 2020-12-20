package com.base.my_java.myVolatile;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/1 11:37
 * Description:  没有volatile修饰的的没有可见性
 */
public class VolatileDemo1 {

    public static void main(String[] args) {
        MyTestNumber addTest = new MyTestNumber();
        // 线程1
        new Thread(() -> {
            System.out.println("获取该线程的名字:" + Thread.currentThread().getName() + "  b的值:" + addTest.b);
            try {
                // 故意停顿5秒
                Thread.sleep(5000);
                addTest.add2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("输出该线程的名字:" + Thread.currentThread().getName() + "  b的值:" + addTest.b);
        }, "线程1").start();

        // 线程2
        new Thread(() -> {
            while (addTest.b == 0) {
                // 一直等待，直到值改变为止
            }
            // 理论上，这里不会输出，会一直在上面的死循环中等待
            System.out.println("普通的没有有可见性，不知道线程中b的值已经发生变化了");
            System.out.println("输出该线程的名字:" + Thread.currentThread().getName() + "  b的值:" + addTest.b);
        }, "线程2").start();


    }


}

