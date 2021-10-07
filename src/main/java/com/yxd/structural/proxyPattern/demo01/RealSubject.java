package com.yxd.structural.proxyPattern.demo01;

public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
