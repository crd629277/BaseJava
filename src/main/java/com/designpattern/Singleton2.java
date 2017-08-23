package com.designpattern;

/**
 * Created by chenwinfred on 11/11/16.
 */
public class Singleton2 {

    // 一开始就创建该实例
    private static final Singleton2 instance = new Singleton2();

    // 一定要写私有构造函数，否则默认的构造函数时共有的
    private Singleton2() {
    }

    // 静态工厂方法
    public static Singleton2 getInstance() {
        return instance;
    }

}
