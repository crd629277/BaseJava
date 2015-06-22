package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class ThreeSumTest extends TestCase {
    ThreeSum object = new ThreeSum();


    @Test
    public void testSolution() throws Exception {

        System.out.println(object.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
        System.out.println(object.threeSum(new int[] {1, -1, -1, 0}));
    }
}