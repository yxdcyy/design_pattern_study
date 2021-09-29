package com.yxd.structural.adapterPattern.demo07;

public class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doHandler();
    }
}
