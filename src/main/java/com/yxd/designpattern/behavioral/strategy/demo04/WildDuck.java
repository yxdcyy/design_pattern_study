package com.yxd.designpattern.behavioral.strategy.demo04;

/**
 * 野生鸭子类
 */
public class WildDuck extends Duck {

    @Override
    protected String getName() {
        return "野生鸭子";
    }

    public WildDuck() {
        super.setFlyBehavior(new GoodFlyBehavior());
    }
}
