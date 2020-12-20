package com.base.my_java.myStream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/11 14:28
 * Description:使用Stream流
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张旺达");
        list.add("张一丰");
        list.add("张二丰");
        list.add("张大");
        list.add("李世民");
        list.stream().forEach((name) -> {
            System.out.println("中文打印" + name);
        });

        //使用stream流输出
        list.stream()
                .filter((name) -> {
                    return name.startsWith("张");
                })
                .filter((name) -> {
                    return name.length() == 3;
                })
                .forEach((name) -> {
                    System.out.println(name);
                });
    }
}
