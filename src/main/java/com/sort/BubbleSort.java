package com.sort;

import com.util.PrintOut;

/**
 * Created by Chen on 2015/4/2.
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(int[] data) {
        for (int i=data.length-1; i>0; i--) {
            boolean flag = true;
            for (int j=0; j<i; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("break...." + "i=" + i);
                break;
            }
        }

        PrintOut.print(data);

    }

}
