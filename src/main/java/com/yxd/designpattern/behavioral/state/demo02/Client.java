package com.yxd.designpattern.behavioral.state.demo02;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
    }
}
