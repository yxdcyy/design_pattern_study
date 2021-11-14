package com.yxd.behavioral.strategyPattern.demo04;

public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超");
    }
}
