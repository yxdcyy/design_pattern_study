package com.yxd.designpattern.structural.proxy.demo01;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
