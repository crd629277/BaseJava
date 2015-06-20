package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class ThreeSumClosestTest extends TestCase {
    ThreeSumClosest object = new ThreeSumClosest();


    @Test
    public void testSolution() throws Exception {

        assertEquals(2, object.threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
        assertEquals(1, object.threeSumClosest(new int[] {-1, 2, 1, 0}, 1));
        assertEquals(3, object.threeSumClosest(new int[] {0, 1, 2}, 0));
    }
}