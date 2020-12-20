package com.base.my_java.myStream;

import java.util.stream.Stream;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/11 20:41
 * Description: Concat方法：用于把流组合在一起
 * 如果有两个流，希望合并到一个流，可以使用Concat方法
 * Static<T>  Stream<T> Concat(Stream<? extends T> a,Stream<? extends T> b)
 */
public class StreamDemo9 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五");
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        Stream.concat(stream, stream1).forEach((a) -> {
            System.out.println(a);
        });


    }
}
