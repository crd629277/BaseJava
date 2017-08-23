package com.designpattern.decorate;

/**
 * Created by chenwinfred on 1/31/16.
 *
 * 具体的饮料类-浓缩咖啡
 */

public class Espresso extends Beverage {


    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
