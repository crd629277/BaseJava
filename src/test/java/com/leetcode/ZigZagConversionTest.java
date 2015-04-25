package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class ZigZagConversionTest extends TestCase {
    ZigZagConversion object = new ZigZagConversion();


    @Test
    public void testSolution() throws Exception {

        String s = "PAYPALISHIRING";
        String expected = "PAHNAPLSIIGYIR";
        String result = object.convert(s, 3);
        assertEquals(expected, result);

    }
}