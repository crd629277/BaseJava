package com.leetcode;

/**
 * Created by Chen on 2015/5/2.
 */
public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("+123"));
        System.out.println(Integer.valueOf("-123"));
        System.out.println(Integer.valueOf("01"));
    }

    public int myAtoi(String str) {
        boolean negative = false;
        int i = 0, len = str.length();
        int result = 0;
        if (str == null || "".equals(str)) return result;
        while (str.charAt(i) == ' ') i++;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            negative = str.charAt(i++) == '-' ? true : false;
        }
        while (i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if ((result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)
                    || (result > Integer.MAX_VALUE / 10) ) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return negative ? -result : result;
    }
}
