package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://leetcode.com/problems/binary-watch/#/description
 *
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
 * Each LED represents a zero or one, with the least significant bit on the right.
 * Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.
 *
 * Input: n = 1
 * Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 *
 * 一个2进制的手表，有4个LED灯表示时，6个LED表示分，给一个数字n，表示亮n盏灯，问一个有多少钟表示时间的方式
 *
 *
 * Created by chenwinfred on 17/7/8.
 */
public class BinaryWatch {

    public static void main(String[] args) {
        BinaryWatch binaryWatch = new BinaryWatch();
        List<String> result = binaryWatch.readBinaryWatch(1);
        for (String s : result) {
            System.out.println(s);
        }
    }


    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<String>();
        // 穷举 深度优先遍历，判断是否符合条件
        for (int h=0; h<12; h++) {
            for (int m=0; m<60; m++) {
                // Integer的bitCount方法把十进制数转为二进制数后，返回该二进制数的1的个数，如3(011)返回2
                if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    result.add(String.format("%d:%02d", h, m));
                }
            }
        }

        return result;
    }
}
