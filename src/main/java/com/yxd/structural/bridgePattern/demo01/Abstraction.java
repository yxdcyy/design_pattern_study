package com.yxd.structural.bridgePattern.demo01;

/**
 * 抽象角色
 */
public abstract class Abstraction {
    protected IImplementor implementor;

    public Abstraction(IImplementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        this.implementor.operationImpl();
    }
}
