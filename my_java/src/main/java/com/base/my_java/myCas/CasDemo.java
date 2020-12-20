package com.base.my_java.myCas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/6 14:09
 * Description: cas的问题
 */
public class CasDemo {

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(3);
        boolean b = atomicInteger.compareAndSet(3, 2019);
        System.out.println(b); // true
        boolean b1 = atomicInteger.compareAndSet(3, 2020);
        System.out.println(b1); // false
        atomicInteger.getAndIncrement();

    }
}
