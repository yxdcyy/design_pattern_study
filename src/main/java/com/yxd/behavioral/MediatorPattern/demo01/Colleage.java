package com.yxd.behavioral.MediatorPattern.demo01;

/**
 * 抽象同事类
 */
public abstract class Colleage {

    private Mediator mediator;

    public Colleage(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
