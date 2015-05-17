package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class LongestCommonPrefixTest extends TestCase {
    LongestCommonPrefix object = new LongestCommonPrefix();


    @Test
    public void testSolution() throws Exception {
        assertEquals("ab", object.longestCommonPrefix(new String[] {"abc", "abdef", "abcdef"}));
        assertEquals("", object.longestCommonPrefix(new String[] {}));
    }
}