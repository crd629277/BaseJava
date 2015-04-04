package com.util;

/**
 * Created by Chen on 2015/3/30.
 */
public class Util {

    public static void main(String[] args) {
        System.out.println("Hello");

        powerOfTwo(2);
        powerOfTwo(10);
        powerOfTwo(512);

        powerOfTwo2(2);
        powerOfTwo2(10);
        powerOfTwo2(512);
    }


    public static boolean powerOfTwo(int i) {
        while (i%2 == 0) {
            i = i/2;
        }
        if (i == 1) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean powerOfTwo2(int i) {
        if ((i & (i-1)) == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

}
