package com.leetcode.backtracking;

import java.util.List;

/**
 *
 * https://leetcode.com/problems/n-queens/#/description
 *
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 *
 *
 * N皇后问题，给一个整数n，求所有不同的解
 *
 *
 * Created by chenwinfred on 17/7/9.
 */
public class NQueens {


    public List<List<String>> solveNQueens(int n) {
        // 创建并初始化n*n数组
        String[][] board = new String[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = ".";
            }
        }

        // 根据行去遍历，设置当前给Q，然后判断是否符合要求，如果符合，递归求解，否则返回上一层调用
        return  null;

    }


    // 判断数组是否数合法的n皇后问题的解
    private boolean isValided(String[][] queens) {
        return false;
    }


    // 当是合法的解时，构造当前的解的返回格式
    private List<String> print(String[][] queens) {
        return null;
    }


}
