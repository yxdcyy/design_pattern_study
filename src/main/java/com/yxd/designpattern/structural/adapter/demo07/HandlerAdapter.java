package com.yxd.designpattern.structural.adapter.demo07;

/**
 * Adapter 接口
 */
public interface HandlerAdapter {

    public boolean supports(Object handler);

    public void handle(Object handler);
}
