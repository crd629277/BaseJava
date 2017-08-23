package com.leetcode;

/**
 * Created by chenwinfred on 11/16/16.
 */
public class RangeSumQuery {

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery o = new RangeSumQuery(nums);

        System.out.println(o.sumRange(0, 2));
        System.out.println(o.sumRange(2, 5));
        System.out.println(o.sumRange(0, 5));
    }

    private int[] nums;

    public RangeSumQuery(int[] nums) {
        for(int i=1; i<nums.length; i++) {
            nums[i] +=  nums[i-1];
        }
        this.nums = nums;

    }

    public int sumRange(int i, int j) {
        if (i==0) return nums[j];

        return nums[j] - nums[i-1];
    }
}
