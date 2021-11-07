package com.yxd.behavioral.statePattern.demo02;

/**
 * 具体状态类 B
 */
public class ConcreteStateB extends State {

    @Override
    public void handle() {
        System.out.println("StateB do action");
    }
}
