package com.designpattern.proxy.staticproxy;

/**
 * Created by chenwinfred on 6/14/15.
 */
public class CountImpl implements Count{
    public void queryCount() {
        System.out.println("Running query...");
    }

    public void updateCount() {
        System.out.println("Running update...");
    }
}
