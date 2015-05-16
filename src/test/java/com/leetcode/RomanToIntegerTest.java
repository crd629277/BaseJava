package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class RomanToIntegerTest extends TestCase {
    RomanToInteger object = new RomanToInteger();


    @Test
    public void testSolution() throws Exception {
        assertEquals(2548, object.romanToInt("MMDXLVIII"));
        assertEquals(1884, object.romanToInt("MDCCCLXXXIV"));
    }
}