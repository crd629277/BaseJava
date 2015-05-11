package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class ContainerWithMostWaterTest extends TestCase {
    ContainerWithMostWater object = new ContainerWithMostWater();


    @Test
    public void testSolution() throws Exception {
        assertEquals(4, object.maxArea(new int[] {1, 2, 3, 4}));
    }
}