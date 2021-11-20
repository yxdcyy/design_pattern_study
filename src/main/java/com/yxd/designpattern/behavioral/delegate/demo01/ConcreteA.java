package com.yxd.designpattern.behavioral.delegate.demo01;

public class ConcreteA implements ITask {
    @Override
    public void doTask() {
        System.out.println("ConcreteA 执行 doTask()");
    }
}
