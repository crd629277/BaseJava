package com.designpattern.decorate;

/**
 * Created by chenwinfred on 1/31/16.
 *
 * 具体的饮料类-家常咖啡
 */

public class HouseBlend extends Beverage {


    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
