package com.base.my_java.myStream;

import java.util.stream.Stream;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/11 18:48
 * Description: Stream流中的filter方法：用于对Stream流中的数据进行过滤
 * Stream<T> filter(Predicate<? Super T> predicate)
 * filter方法的参数是Predicate，是一个函数式接口，所以可以传达lambda表达式，对数据进行过滤
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "张思", "张无", "赵云");
        stream.filter((name) -> {
            return name.startsWith("张");
        })
                .forEach((name) -> {
                    System.out.println("名字:" + name);
                });

    }
}
