package com.yxd.behavioral.strategyPattern.demo04;

/**
 * 北京鸭子类
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        super.setFlyBehavior(new BadFlyBehavior());
    }

    @Override
    protected String getName() {
        return "北京鸭子";
    }
}
