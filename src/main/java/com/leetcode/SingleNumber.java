package com.leetcode;

import java.util.HashMap;

/**
 * Created by chenwinfred on 17/3/19.
 */
public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();

        int [] nums = {1, 2, 2, 1, 4, 3, 3};

        System.out.println(sn.singleNumber(nums));
    }


    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
}
