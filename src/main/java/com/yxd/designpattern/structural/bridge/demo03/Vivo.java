package com.yxd.designpattern.structural.bridge.demo03;

public class Vivo implements IBrand {
    @Override
    public void open() {
        System.out.println("Vivo 手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo 手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo 手机打电话");
    }
}
