package com.sort;

import com.util.PrintOut;

/**
 * Created by Chen on 2015/4/2.
 */
public class ShellSort implements Sort {

    @Override
    public void sort(int[] data) {
        int dlta[] = {3, 2, 1};     // 增量序列，最后一个增量值必须为1
        for (int k=0; k<dlta.length; k++) {
            shellInsert(data, dlta[k]);     //一趟增量为dlta[k]的增量排序
        }
        PrintOut.print(data);
    }

    // 一趟希尔排序, dk为增量
    private void shellInsert(int[] data, int dk) {
        int temp;
        for (int i=dk+1; i<data.length; i++) {
            temp = data[i];                 //数据暂存temp
            int j = i-dk;
            while (j>=0 && temp < data[j]) {
                data[j+dk] = data[j];       //记录后移
                j-=dk;
            }
            data[j+dk] = temp;              //插入
        }
    }

}
