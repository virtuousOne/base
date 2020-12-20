package com.base.my_java.myMap;

/**
 * @Author: 吴宸煊
 * Date: 2020/11/28 14:47
 * Description: 二分查找算法
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,9,45,11,25,36,48,96,58};
        int data = 11;
        int a = binarySearch(arr,data);
        System.out.println(a);

    }

    public static int binarySearch(int[] arr,int data){
        int low =0;
        int height = arr.length -1;
        while(low <= height){
            int mid = low+(height-low) /2;

            if(arr[mid] < data){
                low = mid +1;
            } else if (arr[mid] == data){
                return  mid;
            } else {
                height = mid -1;
            }

        }
        return  -1;
    }
}
