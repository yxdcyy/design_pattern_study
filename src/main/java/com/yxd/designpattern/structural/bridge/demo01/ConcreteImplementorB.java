package com.yxd.designpattern.structural.bridge.demo01;

public class ConcreteImplementorB implements IImplementor {
    @Override
    public void operationImpl() {
        System.out.println("I'm ConcreteImplementor B");
    }
}
