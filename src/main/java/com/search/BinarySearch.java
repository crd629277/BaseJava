package com.search;

/**
 * Created by Chen on 2015/4/9.
 */
public class BinarySearch {

    public int search(int[] data, int key) {
        int low = 0;
        int high = data.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (key == data[mid]) {
                return mid;
            } else if (key > data[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
