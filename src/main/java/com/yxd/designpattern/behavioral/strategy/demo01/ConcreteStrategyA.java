package com.yxd.designpattern.behavioral.strategy.demo01;

/**
 * 具体策略类 A
 */
public class ConcreteStrategyA implements IStrategy {

    @Override
    public void algorithm() {
        System.out.println("Strategy A");
    }
}
