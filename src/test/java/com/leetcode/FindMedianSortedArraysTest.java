package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class FindMedianSortedArraysTest extends TestCase {
    FindMedianSortedArrays object = new FindMedianSortedArrays();


    @Test
    public void testSolution() throws Exception {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {7, 8, 9, 10};
        double expected = 7.0;
        double result = object.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, result);

    }
}