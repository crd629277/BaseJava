package com.leetcode;


import java.util.Arrays;

/**
 * Created by chenwinfred on 17/7/1.
 *
 * https://leetcode.com/problems/array-partition-i/#/description
 */
public class ArrayPartionI {
    public static void main(String[] args) {
        ArrayPartionI object = new ArrayPartionI();
        int[] nums = {1, 4, 3, 3};

        System.out.println(object.arrayPairSum(nums));
    }



    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        return  sum;
    }
}
