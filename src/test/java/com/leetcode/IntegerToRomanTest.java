package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class IntegerToRomanTest extends TestCase {
    IntegerToRoman object = new IntegerToRoman();


    @Test
    public void testSolution() throws Exception {
        assertEquals("IV", object.intToRoman(4));
        assertEquals("X", object.intToRoman(10));
    }
}