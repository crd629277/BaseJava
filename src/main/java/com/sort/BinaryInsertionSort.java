package com.sort;

import com.util.PrintOut;

/**
 * Created by Chen on 2015/4/2.
 */
public class BinaryInsertionSort implements Sort {

    @Override
    public void sort(int[] data) {
        int temp;
        for (int i=1; i<data.length; i++) {
            temp = data[i];
            int low = 0;
            int high = i - 1;
            int mid = 0;
            while (low <= high) {
                mid = (low + high)/2;
                if (temp < data[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            for (int k=i-1; k>=low; k--) {
                data[k+1] = data[k];
            }

            data[low] = temp;
        }

        PrintOut.print(data);

    }

}
