package com.sort;

import com.util.PrintOut;

/**
 * Created by Chen on 2015/4/2.
 */
public class QuickSort implements Sort {

    @Override
    public void sort(int[] data) {
        quickSort(data, 0, data.length-1);                          //对数组进行递归排序
        PrintOut.print(data);
    }


    private void quickSort(int[] data, int low, int high) {
        if (low < high) {                                           //长度大于1
            int pivotLocation = partition(data, low, high);         // 将data[low..high]一分为二
            quickSort(data, low, pivotLocation-1);                  // 对低子表递归排序
            quickSort(data, pivotLocation+1, high);                 // 对高子表递归排序
        }
    }

    // 一次快速排序，返回枢轴的位置
    private int partition(int[] data, int low, int high) {
        int pivotKey = data[low];

        while (low < high) {
            while (low < high && data[high] >= pivotKey) high--;
            data[low] = data[high];                                 //将比枢轴小的的记录移动到低端

            while (low < high && data[low] <= pivotKey) low++;
            data[high] = data[low];                                 //将比枢轴大的的记录移动到高端
        }
        data[low] = pivotKey;                                       //枢轴最终位置
        return low;                                                //最终low==high
    }

}
