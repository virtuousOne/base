package com.base.my_java.myCas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/6 20:56
 * Description: 解决ABA问题
 */
public class CasDemo2 {
    //初始值为100， 初始版本号为1
    static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100, 1);

    public static void main(String[] args) {
        new Thread(() -> {
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName() + "的初始值：" + stamp);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atomicStampedReference.compareAndSet(100, 101, atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName() + ":" + atomicStampedReference.getStamp());
            atomicStampedReference.compareAndSet(101, 100, atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName() + ":" + atomicStampedReference.getStamp());
        }, "t3").start();


        new Thread(() -> {
            // 暂停3秒，等线程t1执行完成
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName() + "的初始值：" + stamp);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean result = atomicStampedReference.compareAndSet(100, 2019, stamp, stamp + 1);
            System.out.println(Thread.currentThread().getName() + ":" + atomicStampedReference.getStamp() + ":" + result);
        }).start();
    }
}
