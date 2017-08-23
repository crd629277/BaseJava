package com.designpattern.decorate;

/**
 * Created by chenwinfred on 1/31/16.
 *
 * 饮料抽象类
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
