package com.yxd.behavioral.delegatePattern.demo01;

public class ConcreteB implements ITask {
    @Override
    public void doTask() {
        System.out.println("ConcreteB 执行 doTask()");
    }
}
