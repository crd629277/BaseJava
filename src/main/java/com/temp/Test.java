package com.temp;

import java.util.Stack;

/**
 * Created by chenwinfred on 6/21/15.
 */
public class Test {
    int i=0;

    public static void main(String[] args) {
        Test test = new Test();

        float x = 1, y = 2, z = 3;
        System.out.println(y+=((z--)/(++x)));

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        String s = "45";
        System.out.println(Integer.valueOf(s));

        Stack stack = new Stack();

    }



}
