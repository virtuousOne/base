package com.base.my_java.myStream;

import java.util.stream.Stream;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/11 19:08
 * Description: map方法
 * 如果需要将流中的元素映射到另一个流中，可以使用map方法
 * R Stream<R> map(Function<? Super T,? extends R> mapper)
 * 该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转化为另一种R类型的流
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("23", "34", "55");
        Stream<Integer> stream1 = stream.map((name) -> {
            return Integer.parseInt(name);
        });
        stream1.forEach((a) -> {
            System.out.println(a);
        });

    }
}
