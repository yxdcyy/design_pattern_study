package com.yxd.designpattern.structural.adapter.demo07;

public class HttpController implements Controller {
    @Override
    public void doHandler() {
        System.out.println("http...");
    }
}
