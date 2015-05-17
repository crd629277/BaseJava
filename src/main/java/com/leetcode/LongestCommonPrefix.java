package com.leetcode;

/**
 * Created by chenwinfred on 15/5/17.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        int len = strs.length;
        for (int i = 1; i < len; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }


    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";

        String prefix = strs[0];
        int len = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            len = len < strs[i].length() ? len : strs[i].length();

            int j;
            for (j = 0; j < len; j++) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            prefix = prefix.substring(0, j);
            len = j;
        }

        return prefix;
    }
}
