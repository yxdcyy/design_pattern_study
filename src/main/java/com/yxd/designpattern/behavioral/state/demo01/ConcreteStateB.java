package com.yxd.designpattern.behavioral.state.demo01;

/**
 * 具体状态 B
 */
public class ConcreteStateB implements IState {
    @Override
    public void handle() {
        // 必要时需要进行状态切换
        System.out.println("StateB do action");
    }
}
