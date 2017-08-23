package com.leetcode;

import java.util.Arrays;

/**
 * Created by chenwinfred on 17/7/1.
 *
 * https://leetcode.com/problems/missing-number/#/description
 */
public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber object = new MissingNumber();

        int[] nums0 = {0, 1, 3}; // expected 2
        int[] nums1 = {0}; // excepted 1
        int[] nums2 = {1}; // excepted 0
        int[] nums3 = {1, 2}; // excepted 0
        int[] nums4 = {0, 1}; // excepted 2

        System.out.println(object.missingNumber(nums0));
        System.out.println(object.missingNumber(nums1));
        System.out.println(object.missingNumber(nums2));
        System.out.println(object.missingNumber(nums3));
        System.out.println(object.missingNumber(nums4));
    }



    // 使用xor异或运算
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor;
    }



    // 原始方法，特殊判断情况多，代码不简洁
    public int missingNumber0(int[] nums) {
        if(nums.length == 1) {
            return nums[0] > 0 ? 0 : 1;
        }
        Arrays.sort(nums);

        if (nums[0] != 0) return 0;

        int result = nums[nums.length-1] + 1;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] + 1 != nums[i+1]) {
                result =  nums[i] + 1;
                break;
            }
        }
        return result;
    }
}
