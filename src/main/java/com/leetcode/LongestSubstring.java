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

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>(256);
        for (int i=0,j=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max , i-j+1);
        }
        return max;
    }

}
