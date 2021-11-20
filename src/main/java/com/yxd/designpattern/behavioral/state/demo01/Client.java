package com.yxd.designpattern.behavioral.state.demo01;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
    }
}
