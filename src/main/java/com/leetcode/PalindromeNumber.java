package com.leetcode;

/**
 * Created by Chen on 2015/5/3.
 */

/**
 *
 * https://leetcode.com/problems/palindrome-number/
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int result = 0;
        while (temp > 0 ) {
            result = result * 10 + temp % 10;
            temp = temp / 10;
        }
        if (result == x) return true;
        else return false;
    }
}
