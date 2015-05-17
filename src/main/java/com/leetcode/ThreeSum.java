package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chenwinfred on 5/17/15.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();

        Arrays.sort(nums);
        if (nums.length < 3) return res;

        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            if (i == 0 || (i > 0 && (nums[i] != nums[i - 1]))) {
                int twoSum = 0 - nums[i];

                int low = i + 1, high = len - 1;
                while (low < high) {
                    if (nums[low] + nums[high] > twoSum) {
                        high--;
                    } else if (nums[low] + nums[high] < twoSum) {
                        low++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    }
                }
            }
        }
        return res;
    }

}
