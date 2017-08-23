package com.designpattern.strategy;

/**
 * Created by chenwinfred on 1/10/16.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("I'm Quack.");
    }
}
