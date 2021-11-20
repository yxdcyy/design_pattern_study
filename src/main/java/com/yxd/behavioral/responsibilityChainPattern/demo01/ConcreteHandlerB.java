package com.yxd.behavioral.responsibilityChainPattern.demo01;

/**
 * 具体处理者 B
 */
public class ConcreteHandlerB extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("requestB".equals(request)) {
            System.out.println(this.getClass().getSimpleName() + " deal with request: " + request);
            return;
        }
        if (this.nextHandler != null) {
            this.nextHandler.handleRequest(request);
        }
    }
}
