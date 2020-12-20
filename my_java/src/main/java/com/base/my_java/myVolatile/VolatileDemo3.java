package com.base.my_java.myVolatile;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/1 19:37
 * Description: 验证Volatile的不保证原子性
 */
public class VolatileDemo3 {

    public static void main(String[] args) {
        MyTestNumber myTestNumber = new MyTestNumber();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 2000; j++) {
                    myTestNumber.addPlus();
                }

            }, "线程").start();
        }
        // 等待线程执行完，再输出结果
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        // 如果保证了原子性，最终的结果永恒是20001
        System.out.println(Thread.currentThread().getName() + "\t finally number value :" + myTestNumber.i);
    }
}
