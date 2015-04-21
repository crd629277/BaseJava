package com.leetcode;

import com.leetcode.twosum.TwoSum;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest extends TestCase {
    TwoSum object = new TwoSum();


    @Test
    public void testTwoSum() throws Exception {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1,2};
        int[] result = object.twoSum(numbers, target);
        Assert.assertArrayEquals(expected, result);

        int[] numbers1 = {3, 2, 4};
        int target1 = 6;
        int[] expected1 = {2, 3};
        int[] result1 = object.twoSum(numbers1, target1);
        Assert.assertArrayEquals(expected1, result1);

    }
}