package com.yxd.structural.decoratorPattern.demo01;

public class Client {
    public static void main(String[] args) {
        Component c1 = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(c1);
        decoratorA.operation();
        System.out.println("===================================================");
        Decorator decoratorB = new ConcreteDecoratorB(c1);
        decoratorB.operation();
        System.out.println("===================================================");
        // 装饰器也可以装饰具体的装饰对象，此时相当于给对象在增加功能 A 的基础上再增加功能 B
        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);
        decoratorBandA.operation();
    }
}
