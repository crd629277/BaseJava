package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class ReverseIntegerTest extends TestCase {
    ReverseInteger object = new ReverseInteger();


    @Test
    public void testSolution() throws Exception {
        assertEquals(321, object.reverse(123));
        assertEquals(-321, object.reverse(-123));
        assertEquals(1, object.reverse(1000));
        assertEquals(0, object.reverse(1534236469));
        assertEquals(-2143847412, object.reverse(-2147483412));
    }
}