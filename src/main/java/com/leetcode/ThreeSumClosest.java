package com.leetcode;

import java.util.Arrays;

/**
 * Created by chenwinfred on 5/19/15.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) return 0;
        Arrays.sort(nums);
        int len = nums.length;
        int closest = nums[0] + nums[1] + nums[len - 1];

        for (int i = 0; i < len-2; i++) {
            int low = i+1, high = len-1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum > target) {
                    high--;
                } else if (sum < target) {
                    low++;
                } else {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
            }

        }
        return closest;
    }
}
