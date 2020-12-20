package com.base.my_java.myStream;

import java.util.stream.Stream;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/11 20:32
 * Description: Skip()方法:用于跳过元素
 * 如果希望跳过前几个元素，可以使用skip方法获取一个截取后的薪的流
 * Stream<T> Skip(long n)
 * 如果流当前的长度大于n，则跳过前n个；否则返回一个长度为0的空流
 */
public class StreamDemo8 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "啦啦");
        stream.skip(2).forEach((a) -> {
            System.out.println(a);
        });
    }
}
