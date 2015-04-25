package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class LongestPalindromicSubstringTest extends TestCase {
    LongestPalindromicSubstring object = new LongestPalindromicSubstring();


    @Test
    public void testSolution() throws Exception {

        String s = "abcbade";
        String expected = "abcba";
        String result = object.longestPalindrome(s);
        assertEquals(expected, result);

    }
}