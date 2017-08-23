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

    public static void main(String[] args) {
        LongestPalindromicSubstring o = new LongestPalindromicSubstring();
        System.out.println(o.isPalindromic("abba"));
        System.out.println(o.isPalindromic("abcba"));
    }

    /**
     *
     Method 1

     suppose:
     string(i,len) is a substring of s where i is the start index and len is the length
     S(n) is the longest palindrome for substring of s with indice from 0 to n

     if S(n-1) = string(i,len)
     then S(n) = string(n-l, len+1) if string(n-len, len+1) is palindrome
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
        int len = s.length();
        int maxLength = 0;
        String longestString = null;

        for (int i=0; i<len; i++) {
            for (int j=i+1; j<len; j++) {
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
        int len = s.length();
        for (int i=0, j=len-1; i<=j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
