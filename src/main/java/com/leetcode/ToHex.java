package com.leetcode;

import java.util.ArrayList;

/**
 * Created by chenwinfred on 10/30/16.
 */


//https://leetcode.com/problems/convert-a-number-to-hexadecimal/

//Convert a Number to Hexadecimal

public class ToHex {
    public static void main(String[] args) {
        String result = new ToHex().toHex(22);
        System.out.println(result);
        System.out.println(new ToHex().toHex(-1));


//        System.out.println(Integer.toHexString(-1));
    }


    public String toHex(int num) {
        if (num == 0) return "0";
        String result = "";

        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        while (num != 0) {
            result = map[num & 15] + result;
            num = (num>>> 4);
        }
        return result;

    }

}
