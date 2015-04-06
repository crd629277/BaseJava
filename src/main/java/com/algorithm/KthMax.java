package com.algorithm;

/**
 * Created by Chen on 2015/4/6.
 */

import com.util.PrintOut;

/**
 * 数组中第k大的数
 *
 * 使用快速排序（由大到小），先找到第一个枢轴点，k-1比枢轴点小的在左半部分，比枢轴大的在右半部分,等于则找到
 */
public class KthMax {

    public int findKthMax(int data[], int k) {
        int result = quickSort(data, 0, data.length - 1, k);
        PrintOut.print(data);
        return result;
    }


    private int quickSort(int[] data, int left, int right, int k) {
        int pivotLocation = partition(data, left, right);
        if (pivotLocation == k-1) {                                          // 找到
            return data[pivotLocation];
        } else if (pivotLocation > k-1) {                                   // 在前半段
            return quickSort(data, left, pivotLocation-1, k);
        } else {
            return quickSort(data, pivotLocation+1, right, data.length-k);  // 在后半段
        }
    }


    //一趟快速排序，大的数在左边，小的在右边
    private int partition(int[] data, int left, int right) {
        int pivotKey = data[right];
        while (left < right) {
            while (left < right && data[left] >= pivotKey) left++;
            data[right] = data[left];
            while (left < right && data[right] <= pivotKey) right--;
            data[left] = data[right];
        }
        data[left] = pivotKey;
        return left;
    }

}
