package com.yxd.behavioral.strategyPattern.demo04;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术一般");
    }
}
