package com.leetcode;

/**
 * Created by Chen on 2015/5/1.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result * 10 / 10 != result)
                return 0;   // result*10/10 will not equals result if overflow, if not overflow, result*10 + x%10 is safe, then continue
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
