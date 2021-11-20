package com.yxd.behavioral.responsibilityChainPattern.demo01;

/**
 * 抽象处理者
 */
public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}
