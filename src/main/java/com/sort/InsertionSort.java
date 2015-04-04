package com.sort;

import com.util.PrintOut;

/**
 * Created by Chen on 2015/4/2.
 */
public class InsertionSort implements Sort {

    @Override
    public void sort(int[] data) {
        int temp;
        for (int i=1; i<data.length; i++) {
            temp = data[i];
            int j = i-1;
            while (j>=0 && temp < data[j]) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = temp;
        }

        PrintOut.print(data);

    }

}
