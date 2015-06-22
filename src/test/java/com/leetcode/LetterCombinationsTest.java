package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class LetterCombinationsTest extends TestCase {
    LetterCombinations object = new LetterCombinations();


    @Test
    public void testSolution() throws Exception {

        System.out.println(object.letterCombinations("23"));
        System.out.println(object.letterCombinations("0"));
        System.out.println(object.letterCombinations(""));
    }
}