package com.leetcode;

/**
 * Created by chenwinfred on 15/5/17.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = s.length() - 1 ;i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    result += (result >= 5 ? -1 : 1);
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += (result >= 50 ? -10 : 10);
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += (result >= 500 ? -100 : 100);
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }
}
