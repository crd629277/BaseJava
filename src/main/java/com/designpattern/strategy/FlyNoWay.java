package com.designpattern.strategy;

/**
 * Created by chenwinfred on 1/10/16.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I'm can't Fly.");
    }
}
