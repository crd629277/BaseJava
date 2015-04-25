package com.leetcode;

/**
 * Created by Chen on 2015/4/25.
 */

/**
 *
 https://leetcode.com/problems/zigzag-conversion/

 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

 *
 */

public class ZigZagConversion {

    /**
     *
     Create nRows StringBuffers, and keep collecting characters from original string to corresponding StringBuffer.
     Just take care of your index to keep them in bound.
     */
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i=0; i<numRows; i++)
            sb[i] = new StringBuilder();

        int length = s.length();
        int i=0;
        while (i < length) {
            for (int idx=0; idx<numRows && i<length; idx++) {        // vertically down
                sb[idx].append(s.charAt(i++));
            }
            for (int idx=numRows-2; idx>0 && i<length; idx--) {      // obliquely up
                sb[idx].append(s.charAt(i++));
            }
        }
        for (int idx=1; idx<sb.length; idx++) {
            sb[0].append(sb[idx].toString());
        }
        return sb[0].toString();
    }
}
