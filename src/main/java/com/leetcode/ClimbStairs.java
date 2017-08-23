package com.leetcode;

/**
 * Created by chenwinfred on 11/12/16.
 */
public class ClimbStairs {
    public static void main(String[] args) {
        ClimbStairs o = new ClimbStairs();
//        System.out.println(o.climbStairs2(5));
        System.out.println(o.climbStairs(5));
    }

    // 斐波那契数列
    public int climbStairs(int n) {
        if (n<=2) return n;

        int n1 = 1;
        int n2 = 2;
        int result = 0;
        for (int i=2; i<n; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }


    // 动态规划，存储了每一步的结果，多余了
    public int climbStairs2(int n) {
        if (n<=2) return n;

        int[] tmp = new int[n];
        tmp[0] = 1;
        tmp[1] = 2;

        for (int i=2; i<n; i++) {
            tmp[i] = tmp[i-2] + tmp[i-1];
        }
        for (int i:tmp) {
            System.out.println(i);
        }
        return tmp[n-1];
    }
}
