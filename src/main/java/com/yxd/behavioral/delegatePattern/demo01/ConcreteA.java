package com.yxd.behavioral.delegatePattern.demo01;

public class ConcreteA implements ITask {
    @Override
    public void doTask() {
        System.out.println("ConcreteA 执行 doTask()");
    }
}
