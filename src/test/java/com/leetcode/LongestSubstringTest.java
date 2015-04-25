package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class LongestSubstringTest extends TestCase {
    LongestSubstring object = new LongestSubstring();


    @Test
    public void testSolution() throws Exception {

        String s = "abcabcbb";
        int expected = 3;
        int result = object.lengthOfLongestSubstring(s);
        assertEquals(expected, result);

        assertEquals(1, object.lengthOfLongestSubstring("bbbbb"));

    }
}