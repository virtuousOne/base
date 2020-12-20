package com.base.my_java.myCollection;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/3 11:17
 * Description: 线程不安全问题List
 */
public class ContainerNoSafeDemo {

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }).start();
        }

    }
}

/**
 * 1. 问题： java.util.ConcurrentModificationException
 * <p>
 * 2.原因：
 * 并发，争抢资源导致
 * <p>
 * 3.解决思路：
 * 1） 使用Vector
 * 2)使用 Collections.synchronizedList
 * 3）使用 CopyOnWriteArrayList<>();(推荐使用)
 * <p>
 * 4.日后如何优化
 */
