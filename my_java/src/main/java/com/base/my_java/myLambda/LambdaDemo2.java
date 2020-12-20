package com.base.my_java.myLambda;

import java.util.Arrays;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/9 16:07
 * Description:
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("张三", 31),
                new Person("李四", 25),
                new Person("王五", 28)
        };

        Arrays.sort(people, (Person p1, Person p2) -> {
            return p1.getAge() - p2.getAge();
        });

        for (Person p : people) {
            System.out.println(p);
        }

    }
}
