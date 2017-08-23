package com.leetcode;

/**
 * Created by chenwinfred on 17/7/2.
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/description
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray object = new RemoveDuplicatesFromSortedArray();


        int[] nums1 = {1, 1, 2}; // excepted 2
        int[] nums2 = {1, 2, 2, 2, 3, 4}; // 4

        System.out.println(object.removeDuplicates(nums1));
        System.out.println(object.removeDuplicates(nums2));
    }


    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 1;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                count ++;
            }
        }
        return count;
    }
}
