package com.yxd.designpattern.behavioral.templateMethod.demo01;

public class Client {
    public static void main(String[] args) {
        AbstractClass abc = new ConcreteClassA();
        abc.templateMethod();
        abc = new ConcreteClassB();
        abc.templateMethod();
    }
}
