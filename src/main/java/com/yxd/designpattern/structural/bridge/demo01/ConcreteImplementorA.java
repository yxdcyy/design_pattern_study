package com.yxd.designpattern.structural.bridge.demo01;

public class ConcreteImplementorA implements IImplementor {
    @Override
    public void operationImpl() {
        System.out.println("I'm ConcreteImplementor A");
    }
}
