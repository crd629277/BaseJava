package com.leetcode.twosum;

import java.util.Hashtable;

/**
 * Created by Chen on 2015/4/20.
 *
 * https://leetcode.com/problems/two-sum/
 *
 *
 Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2


 Solution:
 1. O(n2) runtime, O(1) space – Brute force:
 The brute force approach is simple. Loop through each element x and find if there is another value that equals to target – x.
 As finding another value requires looping through the rest of array, its runtime complexity is O(n2).

 2. O(n) runtime, O(n) space – Hash table:
 We could reduce the runtime complexity of looking up a value to O(1) using a hash map that maps a value to its index.
 *
 *
 *
 *
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        for (int i=0; i<numbers.length; i++) {
            if (table.containsKey(numbers[i])) {
                result[0] = table.get(numbers[i]) + 1;
                result[1] = i + 1;
                break;
            } else {
                table.put(target-numbers[i], i);
            }
        }

        return result;
    }

}
