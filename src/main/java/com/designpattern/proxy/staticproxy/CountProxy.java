package com.designpattern.proxy.staticproxy;

/**
 * Created by chenwinfred on 6/14/15.
 */
public class CountProxy implements Count {
    private CountImpl countImpl;

    public CountProxy(CountImpl countImpl) {
        this.countImpl = countImpl;
    }

    public void queryCount() {
        System.out.println("Before query...");
        countImpl.queryCount();
        System.out.println("After query...");
    }

    public void updateCount() {
        System.out.println("Before update...");
        countImpl.queryCount();
        System.out.println("After update...");
    }
}
