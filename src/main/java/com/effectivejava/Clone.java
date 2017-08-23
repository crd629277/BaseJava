package com.effectivejava;

/**
 * Created by chenwinfred on 8/9/15.
 */
public class Clone implements Cloneable{
    int i = 10;
    String string = "hello";

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Clone clone = new Clone();
        Clone copy = (Clone) clone.clone();
        System.out.println(copy.i);
        System.out.println(copy.string);
    }
}
