package com.yxd.designpattern.structural.flyweight.demo01;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        IFlyweight flyweight1 = flyweightFactory.getFlyweight("aa");
        IFlyweight flyweight2 = flyweightFactory.getFlyweight("bb");
        flyweight1.operation("a");
        flyweight2.operation("b");
    }
}
