package com.yxd.structural.adapterPattern.demo07;

public class AnnotationController implements Controller {
    @Override
    public void doHandler() {
        System.out.println("annotation...");
    }
}
