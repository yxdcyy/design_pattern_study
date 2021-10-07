package com.yxd.behavioral.delegatePattern.demo01;

import java.util.Random;

public class Delegate implements ITask {

    @Override
    public void doTask() {
        System.out.println("代理执行开始...");
        ITask task = null;
        if (new Random().nextBoolean()) {
            task = new ConcreteA();
            task.doTask();
        } else {
            task = new ConcreteB();
            task.doTask();
        }
        System.out.println("代理执行完毕...");
    }
}
