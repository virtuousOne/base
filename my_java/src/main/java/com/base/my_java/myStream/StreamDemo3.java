package com.base.my_java.myStream;

import java.util.stream.Stream;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/11 18:26
 * Description:Stream流中的forEach方法
 * void Foreach(Consumer<? Super T> action)
 * 该方法接收一个Consumer接口函数，会将每个流元素交给该函数处理
 * Consumer接口是一个消费型的函数式接口，可以传达lambda表达式，消费数据
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵云", "关羽");
        stream.forEach((name) -> {
            System.out.println(name);
        });
    }
}
