package com.leetcode;

/**
 * Created by chenwinfred on 11/20/16.
 *
 * https://leetcode.com/problems/unique-paths-ii/
 *
 */
public class UniquePaths2 {

    public static void main(String[] args) {
        UniquePaths2 o = new UniquePaths2();

        int[][] nums = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(o.uniquePathsWithObstacles(nums));

    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int cloumn = obstacleGrid[0].length; //列数
        int[] dp = new int[cloumn];
        dp[0] = 1; // 第1列初始值为1，当不是障碍物的时候

        for (int i=0; i<obstacleGrid.length; i++) {
            for (int j=0; j<obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                } else if (j > 0){
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[cloumn-1];
    }


}
