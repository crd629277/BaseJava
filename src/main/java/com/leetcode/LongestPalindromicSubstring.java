package com.leetcode;

/**
 * Created by Chen on 2015/4/25.
 */

/**
*
 https://leetcode.com/problems/longest-palindromic-substring/

 Given a string S, find the longest palindromic substring in S.
 You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.

 *
 */
public class LongestPalindromicSubstring {

    /**
     *
     Method 1

     suppose:
     string(i,len) is a substring of s where i is the start index and len is the length
     S(n) is the longest palindrome for substring of s with indice from 0 to n

     if S(n-1) = string(i,len)
     then S(n) =
     string(n-l, len+1) if string(n-len, len+1) is palindrome
     string(n-len-1, len+2) if string(n-len-1, len+2) is palindrome
     S(n) otherwise

     */

    public String longestPalindrome(String s) {
        int start=0, len=0;
        for (int current=0; current<s.length(); current++) {
            if (isPalindromic(s, current-len, current)) {
                start = current-len;
                len++;
            } else if (current-len-1 >= 0 && isPalindromic(s, current-len-1, current)) {
                start = current-len-1;
                len += 2;
            }
        }
        return new String(s.getBytes(), start, len);
    }

    private boolean isPalindromic(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }


    /**
     *
     * Method 2
     * O(n^3)
     */
    public String longestPalindrome2(String s) {
        int length = s.length();
        int maxLength = 0;
        String longestString = null;

        for (int i=0; i<length; i++) {
            for (int j=i+1; j<length; j++) {
                if (j-i > maxLength) {
                    if (isPalindromic(s.substring(i, j))) {
                        maxLength = j - i;
                        longestString = s.substring(i, j);
                    }
                }
            }
        }
        return longestString;
    }

    private boolean isPalindromic(String s) {
        int length = s.length();
        for (int i=0; i<length-1; i++, length--) {
            if (s.charAt(i) != s.charAt(length-1)) {
                return false;
            }
        }
        return true;
    }

}
