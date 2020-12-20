package com.base.my_java.myCollection;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/3 19:30
 * Description:  线程不安全问题List
 */
public class ContainerNoSafeDemo1 {
    public static void main(String[] args) {
        Set<String> set = new CopyOnWriteArraySet<>();

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(set);
            }).start();
        }

    }

}
