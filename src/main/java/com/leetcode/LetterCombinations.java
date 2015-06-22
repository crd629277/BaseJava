package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chenwinfred on 6/22/15.
 */
public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<String>();
        if (digits.length() == 0) return res;
        res.add("");
        String[] mappings = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            while (res.peek().length() == i) {
                String temp = res.remove();
                int d = Character.getNumericValue(digits.charAt(i));
                for (char s : mappings[d].toCharArray()) {
                    res.add(temp + s);
                }
            }
        }
        return res;
    }
}
