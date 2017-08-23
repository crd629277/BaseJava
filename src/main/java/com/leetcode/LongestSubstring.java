package com.leetcode;

/**
 * Created by Chen on 2015/4/24.
 */

import java.util.HashMap;
import java.util.Map;

/**
 *
 https://leetcode.com/problems/longest-substring-without-repeating-characters/

 Given a string, find the length of the longest substring without repeating characters. For example,
 the longest substring without repeating letters for "abcabcbb" is "abc",
 which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

 *
 */

public class LongestSubstring {

    public static void main(String[] args) {
        LongestSubstring object = new LongestSubstring();
        System.out.println(object.lengthOfLongestSubstring("zabczde"));
        System.out.println(object.lengthOfLongestSubstring2("abcdca"));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0,j=0; j<s.length(); j++) {
            // 当出现重复字符时，找到之前出现该字符的位置，i移到该位置的后一位，但i要比之前的位置要大
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);
            max = Math.max(max , j-i+1);
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character

        index['b'] = '1';
        System.out.println(index[s.charAt(0)]);
        System.out.println(index['b']);

        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

}
