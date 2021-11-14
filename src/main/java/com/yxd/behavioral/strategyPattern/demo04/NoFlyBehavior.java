package com.yxd.behavioral.strategyPattern.demo04;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
