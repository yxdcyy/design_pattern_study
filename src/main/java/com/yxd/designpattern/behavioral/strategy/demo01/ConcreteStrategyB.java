package com.yxd.designpattern.behavioral.strategy.demo01;

/**
 * 具体策略类 B
 */
public class ConcreteStrategyB implements IStrategy {

    @Override
    public void algorithm() {
        System.out.println("Strategy B");
    }
}
