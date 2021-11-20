package com.yxd.designpattern.behavioral.strategy.demo04;

/**
 * 玩具鸭子类
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        super.setFlyBehavior(new NoFlyBehavior());
    }

    @Override
    protected String getName() {
        return "玩具鸭子";
    }
}
