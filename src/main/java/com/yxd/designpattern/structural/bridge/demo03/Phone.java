package com.yxd.designpattern.structural.bridge.demo03;

public abstract class Phone {
    private IBrand brand;

    public Phone(IBrand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
