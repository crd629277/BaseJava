package com.designpattern.decorate;

/**
 * Created by chenwinfred on 1/31/16.
 *
 * 具体的调料装饰者
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage; // 用一个实例变量记录饮料，也就是被装饰者

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
