package com.yxd.structural.adapterPattern.demo07;

public class SimpleController implements Controller {
    @Override
    public void doHandler() {
        System.out.println("simple...");
    }
}
