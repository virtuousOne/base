package com.base.my_java.myLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/7 20:17
 * Description: 写一个自旋锁
 */
public class SpinLock {
    AtomicReference<Thread> threadAtomicReference = new AtomicReference<>();

    public void myLock() {
        Thread thread = Thread.currentThread();
        System.out.println("进入了:" + Thread.currentThread().getName());
        while (!threadAtomicReference.compareAndSet(null, thread)) {

        }

    }

    public void myuNLock() {
        Thread thread = Thread.currentThread();
        threadAtomicReference.compareAndSet(thread, null);
        System.out.println("拜拜了:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SpinLock spinLock = new SpinLock();
        new Thread(() -> {
            spinLock.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLock.myuNLock();
        }, "AA").start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            spinLock.myLock();
            spinLock.myuNLock();
        }, "BB").start();
    }
}
