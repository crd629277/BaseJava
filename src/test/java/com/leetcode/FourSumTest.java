package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class FourSumTest extends TestCase {
    FourSum object = new FourSum();


    @Test
    public void testSolution() throws Exception {

        System.out.println(object.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(object.fourSum(new int[]{1, 0, -1, -1, 0, -2, 2}, 0));
        System.out.println(object.fourSum(new int[]{1, 0, -1, -2, 0, -2, 2}, 0));
        System.out.println(object.fourSum(new int[]{-5, 5, 4, -3, 0, 0, 4, -2}, 4));
        System.out.println(object.fourSum(new int[]{1,-5,1,-4,2,1,-3}, 1));
        System.out.println(object.fourSum(new int[]{0, 0, 0, 0}, 0));
        System.out.println(object.fourSum(new int[]{-1,0,1,2,-1,-4}, -1));
        System.out.println(object.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0));
    }
}