package com.designpattern.proxy.staticproxy;

/**
 * Created by chenwinfred on 6/14/15.
 */
public class Main {
    public static void main(String[] args) {
        CountImpl countImpl = new CountImpl();
        CountProxy proxy = new CountProxy(countImpl);
        proxy.queryCount();
        proxy.updateCount();
    }
}
