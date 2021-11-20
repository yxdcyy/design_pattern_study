package com.yxd.designpattern.structural.facade.demo01;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}
