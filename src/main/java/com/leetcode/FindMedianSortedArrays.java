package com.leetcode;

/**
 * Created by Chen on 2015/4/25.
 */

/**
 *
 https://leetcode.com/problems/median-of-two-sorted-arrays/

 There are two sorted arrays nums1 and nums2 of size m and n respectively.
 Find the median of the two sorted arrays.
 The overall run time complexity should be O(log (m+n)).

 Answer:
 https://leetcode.com/discuss/15790/share-my-o-log-min-m-n-solution-with-explanation

 LeftPart           |            RightPart
 { A[0], A[1], ... , A[i - 1] } | { A[i], A[i + 1], ... , A[m - 1] }
 { B[0], B[1], ... , B[j - 1] } | { B[j], B[j + 1], ... , B[n - 1] }

 1) LeftPart's length == RightPart's length (or RightPart's length + 1)
 2) All elements in RightPart is greater than elements in LeftPart.

 (1) i + j == m - i + n - j (or: m - i + n - j + 1)
 if n >= m, we just need to set:
 i = 0 ~ m, j = (m + n + 1) / 2 - i

 (2) B[j - 1] <= A[i] and A[i - 1] <= B[j]
 considering edge values, we need to ensure:
 (j == 0 or i == m or B[j - 1] <= A[i]) and
 (i == 0 or j == n or A[i - 1] <= B[j])

 */

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;

        if (m > n) return findMedianSortedArrays(nums2, nums1);

        int iMin = 0, iMax = m;
        double result1, result2;

        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = (m + n + 1) / 2 - i;

            if (i>0 && j<n && nums1[i-1] > nums2[j]) {
                iMax = i - 1;
            } else if (j>0 && i<m && nums2[j-1] > nums1[i]) {
                iMin = i + 1;
            } else {
                if (i == 0 ) result1 = nums2[j-1];
                else if (j == 0) result1 = nums1[i-1];
//                else result1 = Math.max(nums1[i-1], nums2[j-1]);
                else result1 = nums1[i-1] > nums2[j-1] ? nums1[i-1] : nums2[j-1];

                if ((m+n) % 2 == 1) return result1;

                if (i == m) result2 = nums2[j];
                else if (j == n) result2 = nums1[i];
//                else result2 = Math.min(nums1[i], nums2[j]);
                else result2 = nums1[i] > nums2[j] ? nums2[j] : nums1[i];

                return (result1 + result2) / 2.0;
            }
        }
        return 0;
    }

}
