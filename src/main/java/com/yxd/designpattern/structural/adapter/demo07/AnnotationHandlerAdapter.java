package com.yxd.designpattern.structural.adapter.demo07;

public class AnnotationHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController)handler).doHandler();
    }
}
