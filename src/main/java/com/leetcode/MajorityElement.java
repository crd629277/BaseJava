package com.leetcode;

/**
 * Created by chenwinfred on 17/7/2.
 *
 * https://leetcode.com/problems/majority-element/#/description
 */
public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();

        int[] nums1 = {1}; // excepted 1
        int[] nums2 = {1, 2, 1, 3, 1}; // excepted 1
        int[] nums3 = {1, 2, 3, 3, 4, 3, 3, 7}; // excepted 3

        System.out.println(majorityElement.majorityElement(nums1));
        System.out.println(majorityElement.majorityElement(nums2));
        System.out.println(majorityElement.majorityElement(nums3));
    }

    /**
     * 多数投票算法
     * 每次都找出一对不同的元素，从数组中删掉，直到数组为空或只有一种元素。 不难证明，如果存在元素e出现频率超过半数，那么数组中最后剩下的就只有e。
     *
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        // count为出现重复次数最多元素的个数，result为该元素的值
        int count = 0, result = -1;

        for (int current : nums) {
            if (count == 0) {
                result = current;
            }

            if (result == current) {
                count ++;
            } else {
                count --;
            }
        }

        return result;
    }
}
