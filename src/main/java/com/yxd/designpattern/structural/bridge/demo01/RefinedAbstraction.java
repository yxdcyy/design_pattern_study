package com.yxd.designpattern.structural.bridge.demo01;

/**
 * 修正角色
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("refined operation");
    }
}
