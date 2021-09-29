package com.yxd.structural.adapterPattern.demo05;

/**
 * 接口适配器
 */
public interface ILoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
