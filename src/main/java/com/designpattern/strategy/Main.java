package com.designpattern.strategy;

/**
 * Created by chenwinfred on 1/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        // 使用setter方法动态地改变鸭子的行为
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());

        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        mallardDuck.swim();
    }
}
