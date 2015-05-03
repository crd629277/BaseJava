package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class PalindromeNumberTest extends TestCase {
    PalindromeNumber object = new PalindromeNumber();


    @Test
    public void testSolution() throws Exception {
        assertEquals(true, object.isPalindrome(12321));
        assertEquals(true, object.isPalindrome(123321));
        assertEquals(false, object.isPalindrome(12343));
    }
}