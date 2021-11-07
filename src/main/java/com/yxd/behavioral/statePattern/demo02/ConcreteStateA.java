package com.yxd.behavioral.statePattern.demo02;

/**
 * 具体状态类 A
 */
public class ConcreteStateA extends State {

    @Override
    public void handle() {
        System.out.println("StateA do action");
        // A 状态完成后自动切换到 B 状态
        this.context.setState(Context.STATE_B);
        this.context.getState().handle();
    }
}
