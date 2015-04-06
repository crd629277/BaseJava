package com.sort;

import com.util.PrintOut;

/**
 * Created by Chen on 2015/4/2.
 */
public class SimpleSelectionSort implements Sort {

    @Override
    public void sort(int[] data) {
        int min, j, loc;
        for (int i=0; i<data.length; i++) {
            min = data[i];
            loc = i;
            for (j=i; j<data.length; j++) {
                if (min > data[j]) {
                    min = data[j];                      // 最小记录
                    loc = j;                            // 最小记录的位置
                }
            }
            if (i != loc) {                             // 与第i个记录交换
                int temp = data[loc];
                data[loc] = data[i];
                data[i] = temp;
            }
        }

        PrintOut.print(data);

    }

}
