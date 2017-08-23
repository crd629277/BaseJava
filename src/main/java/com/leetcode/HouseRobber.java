package com.leetcode;

/**
 * Created by chenwinfred on 11/14/16.
 */
public class HouseRobber {

    public static void main(String[] args) {
        HouseRobber o = new HouseRobber();
        int[] nums1 = {1, 5, 7, 1};
        System.out.println(o.rob(nums1));


        int[] nums2 = {5, 1, 1, 6, 1, 1, 7};
        System.out.println(o.rob(nums2));
    }



    /**
     *
     * 动态规划，d[i]表示第i个元素后的最大值，对于nums[i]，只有两种可能，偷或不偷，d[i]为下面两种情况的最大值
     * 1. 如果偷，则d[i]=d[i-2]+nums[i]
     * 2. 如果不偷，则d[i]=d[i-1]
     * 遍历完后，d[length-1]为最终结果
     * 时间O(n)，空间O(n)，空间可以优化为O(1)
     *
     * @param nums
     * @return
     */
    public int rob2(int[] nums) {
        int[] d = new int[nums.length];
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        d[0] = nums[0];
        d[1] = Math.max(nums[0], nums[1]);

        for (int i=2; i<nums.length; i++) {
            d[i] = Math.max(d[i-2] + nums[i], d[i-1]);
        }

        return d[nums.length-1];
    }


    /**
     * 动态规划，空间O(1)
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        int preRob = 0; // 前一个偷的最大值
        int preNotRob = 0;  // 前一个不偷的最大值

        for (int i=0; i<nums.length; i++) {
            int temp = preRob;
            preRob = preNotRob + nums[i];
            preNotRob = Math.max(temp, preNotRob);
        }

        return Math.max(preRob, preNotRob);
    }

}
