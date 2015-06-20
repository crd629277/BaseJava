package com.leetcode;

import java.util.Arrays;

/**
 * Created by chenwinfred on 5/19/15.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) return 0;
        Arrays.sort(nums);
        int closest = 0;
        int len = nums.length;
        for (int i = 0; i < len-2; i++) {
            int low = i+1, high = len-1;
            int temp = target - nums[i];
            int twoSum = nums[low] + nums[high];
            while (low < high) {
                if (nums[low] + nums[high] > temp) {
                    high --;
                    closest = (Math.abs(nums[low] + nums[high]) > twoSum ? twoSum : Math.abs(nums[low] + nums[high]));
                } else if (nums[low] + nums[high] < temp) {
                    low++;
                    closest = (Math.abs(nums[low] + nums[high]) > twoSum ? twoSum : Math.abs(nums[low] + nums[high]));
                } else {
                    return target;
                }
            }

        }

        return closest;
    }
}
