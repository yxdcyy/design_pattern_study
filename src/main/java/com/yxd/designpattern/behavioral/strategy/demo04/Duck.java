package com.yxd.designpattern.behavioral.strategy.demo04;

/**
 * 鸭子抽象类
 */
public abstract class Duck {

    // 策略接口
    private FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected abstract String getName();

    protected void fly() {
        if (flyBehavior != null) {
            System.out.print(getName() + "飞翔技术：");
            flyBehavior.fly();
        }
    }
}
