package com.yxd.designpattern.behavioral.strategy.demo04;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
