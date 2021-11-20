package com.yxd.designpattern.structural.adapter.demo07;

public class SimpleController implements Controller {
    @Override
    public void doHandler() {
        System.out.println("simple...");
    }
}
