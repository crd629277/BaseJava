package com.leetcode;

/**
 * Created by chenwinfred on 11/20/16.
 *
 * https://leetcode.com/problems/unique-paths/
 *
 */
public class UniquePaths {

    public static void main(String[] args) {
        UniquePaths o = new UniquePaths();

        System.out.println(o.uniquePaths(1, 1)); // 1
        System.out.println(o.uniquePaths(2, 2)); // 2
        System.out.println(o.uniquePaths(3, 3)); // 6
        System.out.println(o.uniquePaths(3, 8)); // 36
    }

    public int uniquePaths(int m, int n) {
        int[] dp = new int[n]; // 一行一行算，下一行的结果覆盖上一行的结果
        dp[0] = 1; // 如果只有1列，永远都是1

        for (int i=0; i<m; i++) {
            for (int j=1; j<n; j++) {
                dp[j] += dp[j-1]; // 从第2列开始，当前值为上面的值加上左边的值
            }
        }
        return dp[n-1];
    }

    // 动态规划，O(n^2)时间和空间，空间可以优化到O(1)
    public int uniquePaths2(int m, int n) {
        int[][] nums = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if(i==0 || j==0) {
                    nums[i][j] = 1; // 只有一列或一行的情况
                } else {
                    nums[i][j] = nums[i-1][j] + nums[i][j-1];
                }
            }
        }

        return nums[m-1][n-1];
    }


    public int uniquePaths3(int m, int n) {
        if (m==0 || n==0) return 0;

        int[][] nums = new int[m][n];
        for (int i=0; i<m; i++) {
            nums[i][0] = 1;
        }

        for (int j=0; j<n; j++) {
            nums[0][j] = 1;
        }

        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                nums[i][j] = nums[i-1][j] + nums[i][j-1];
            }
        }

        return nums[m-1][n-1];
    }







}
