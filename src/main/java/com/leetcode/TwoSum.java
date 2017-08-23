package com.leetcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Chen on 2015/4/20.
 * <p/>
 * https://leetcode.com/problems/two-sum/
 * <p/>
 * <p/>
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p/>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p/>
 * You may assume that each input would have exactly one solution.
 * <p/>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * <p/>
 * <p/>
 * Solution:
 * 1. O(n2) runtime, O(1) space – Brute force:
 * The brute force approach is simple. Loop through each element x and find if there is another value that equals to target – x.
 * As finding another value requires looping through the rest of array, its runtime complexity is O(n2).
 * <p/>
 * 2. O(n) runtime, O(n) space – Hash table:
 * We could reduce the runtime complexity of looking up a value to O(1) using a hash map that maps a value to its index.
 */
public class TwoSum {

    public static void main(String[] args) throws Exception{
        TwoSum twoSum = new TwoSum();
        int[] numbers = {2, 7, 11, 15};

        int[] result = twoSum.twoSum(numbers, 18);
        twoSum.print(result);
    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> table = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            // 放进Map之前先检查之前的数据是否有符合要求的
            if (table.containsKey(numbers[i])) {
                return new int[] {table.get(numbers[i]), i};
            }

            table.put(target - numbers[i], i);
        }
        throw  new IllegalArgumentException("not found");
    }


    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break;
                }
            }
        }

        print(result);
        return result;
    }

    private void print(int[] result) {
        for (int i : result) {
            System.out.println(i);
        }
    }

}
