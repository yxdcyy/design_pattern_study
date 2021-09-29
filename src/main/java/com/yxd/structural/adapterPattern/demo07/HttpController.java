package com.yxd.structural.adapterPattern.demo07;

public class HttpController implements Controller {
    @Override
    public void doHandler() {
        System.out.println("http...");
    }
}
