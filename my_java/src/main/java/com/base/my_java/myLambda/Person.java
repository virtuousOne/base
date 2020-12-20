package com.base.my_java.myLambda;

import lombok.Data;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/9 16:09
 * Description:
 */
@Data
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
