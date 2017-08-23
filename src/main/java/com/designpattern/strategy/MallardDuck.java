package com.designpattern.strategy;

/**
 * Created by chenwinfred on 1/10/16.
 */
public class MallardDuck extends Duck {

/*    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }*/

    @Override
    public void display() {
        System.out.println("I'm MallarDuck");
    }
}
