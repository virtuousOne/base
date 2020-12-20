package com.base.my_java.myCas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/6 20:40
 * Description: ABA问题的出现
 */
public class CasDemo1 {

    static AtomicReference atomicReference = new AtomicReference(100);

    public static void main(String[] args) {
        new Thread(() -> {

            atomicReference.compareAndSet(100, 101);
            atomicReference.compareAndSet(101, 100);
        }, "t1").start();

        new Thread(() -> {
            // 暂停2秒，等线程t1执行完成
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atomicReference.compareAndSet(100, 2019);
            System.out.println("线程名称:" + Thread.currentThread().getName() + ":" + atomicReference.get());
        }, "t2").start();
    }
}
