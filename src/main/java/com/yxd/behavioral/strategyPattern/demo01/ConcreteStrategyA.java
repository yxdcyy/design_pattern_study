package com.yxd.behavioral.strategyPattern.demo01;

/**
 * 具体策略类 A
 */
public class ConcreteStrategyA implements IStrategy {

    @Override
    public void algorithm() {
        System.out.println("Strategy A");
    }
}
