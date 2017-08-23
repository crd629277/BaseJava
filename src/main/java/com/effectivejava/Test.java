package com.effectivejava;

/**
 * Created by chenwinfred on 8/8/15.
 */
public class Test {

    public static void main(String[] args) {
        float f = 1f;
        double d = 1;
        long l = 1;
        int i = 1;
        String s = "1";
        System.out.println(f==i);
        System.out.println(d==i);
        System.out.println(l==i);
        System.out.println(s.equals(f));
        System.out.println(s.equals(d));
        System.out.println(s.equals(l));
        System.out.println(s.equals(i));
    }
}
