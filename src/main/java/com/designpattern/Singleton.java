package com.designpattern;

import java.util.Collection;

/**
 * Created by Chen on 2015/5/2.
 */
public class Singleton {
    private volatile static Singleton instance = null;

//    protected Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = getInstance();
        System.out.println(singleton);

        Collection collection;
    }


}
