package com.leetcode;

/**
 * Created by chenwinfred on 15/5/11.
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuffer result = new StringBuffer();

        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        result.append(M[num/1000]).append(C[num%1000/100]).append(X[num%100/10]).append(I[num%10]);
        return result.toString();
    }

}
