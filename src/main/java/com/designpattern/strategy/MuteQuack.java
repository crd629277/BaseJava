package com.designpattern.strategy;

/**
 * Created by chenwinfred on 1/10/16.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("I can't quack.");
    }
}
