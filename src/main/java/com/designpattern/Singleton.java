package com.designpattern;

import java.util.Collection;

/**
 * Created by Chen on 2015/5/2.
 */
public class Singleton {
    private volatile static Singleton instance = null;

    // 一定要写私有构造函数，否则默认的构造函数时共有的
    private Singleton() {}

    // 静态工厂方法，返回唯一实例；在创建实例的过程中，多线程调用可能导致创建多个实例，需要同步synchronized
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
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

    }


}
