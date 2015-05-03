package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class StringToIntegerTest extends TestCase {
    StringToInteger object = new StringToInteger();


    @Test
    public void testSolution() throws Exception {
        assertEquals(123, object.myAtoi("123"));
        assertEquals(+1234, object.myAtoi("+1234"));
        assertEquals(-123, object.myAtoi("-123"));
        assertEquals(0, object.myAtoi("-a123"));
        assertEquals(10, object.myAtoi("    010"));
        assertEquals(4500, object.myAtoi("     +004500"));
        assertEquals(0, object.myAtoi("+-2"));
        assertEquals(0, object.myAtoi(""));
        assertEquals(2147483647, object.myAtoi("2147483648"));
        assertEquals(-2147483647, object.myAtoi("-2147483647"));
        assertEquals(-12, object.myAtoi("  -0012a42"));
        assertEquals(-2147483648, object.myAtoi("      -11919730356x"));
    }
}