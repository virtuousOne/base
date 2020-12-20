package com.base.my_java.myLeeCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 吴宸煊
 * Date: 2020/12/20 22:44
 * Description:
 */
public class MySum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,9,13,34};
        int target = 9;

        int[] index =toSum(nums,target);
        if(index.length >0){
            for(int element : index){
                System.out.println(element);
            }
        }

        int[] index2 = toSUm2(nums,target);
        if(index2.length >0){
            for(int element : index2){
                System.out.println(element);
            }
        }

    }

    public static int[]  toSum(int[] nums, int target){
        for(int i =0 ; i<nums.length; i++){
            for(int j= i; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return  null;
    }


    public static  int[] toSUm2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int result = target -  nums[i] ;
            if(map.containsKey(result)){
                return new int[]{map.get(result),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
