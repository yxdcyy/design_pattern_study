package com.yxd.structural.adapterPattern.demo07;

/**
 * Adapter 接口
 */
public interface HandlerAdapter {

    public boolean supports(Object handler);

    public void handle(Object handler);
}
