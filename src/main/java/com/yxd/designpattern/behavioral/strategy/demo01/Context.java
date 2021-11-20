package com.yxd.designpattern.behavioral.strategy.demo01;

/**
 * 上下文环境
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        this.strategy.algorithm();
    }
}
