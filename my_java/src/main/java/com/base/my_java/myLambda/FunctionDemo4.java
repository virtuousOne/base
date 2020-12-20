package com.base.my_java.myLambda;

import java.util.function.Supplier;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/10 10:21
 * Description: 使用supplier求数组的最大值
 */
public class FunctionDemo4 {
    public static int getInt(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 56, 74, 32, 45, 89};

        int maxValue = getInt(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中的最大值为:" + maxValue);
    }
}
