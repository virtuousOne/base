package com.base.my_java.myLambda;

import java.util.function.Supplier;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/10 10:12
 * Description: supplier接口
 * 介绍：仅包含一个无参的方法：T get();用来获取泛型指定类型的对象数据
 * Supplier<T> 接口：接口指定泛型的类型，那么get就会获取什么样的类型
 */
public class FunctionDemo3 {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String str = getString(() -> {
            return "我是中国人";
        });
        System.out.println(str);
    }
}
