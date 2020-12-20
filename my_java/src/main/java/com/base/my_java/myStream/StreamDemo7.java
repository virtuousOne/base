package com.base.my_java.myStream;

import java.util.stream.Stream;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/11 20:21
 * Description:limit()方法：只截取流中的元素；
 * limit方法中可以对流进行截取，只取用前n个，
 * Stream<T> limit(long maxSize)
 * 参数是一个long类型，如果集合长度大于当前截取长度则截取，否则不操作
 * limit方法是一个延迟方法，只是对流中的元素进行截取，返回一个新的流，所以可以继续使用Stream流中的其他方法
 */
public class StreamDemo7 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "赵云", "八王爷");
        stream.limit(2).forEach((a) -> {
            System.out.println(a);
        });
    }
}
