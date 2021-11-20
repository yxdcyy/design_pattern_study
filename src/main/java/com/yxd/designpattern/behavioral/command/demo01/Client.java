package com.yxd.designpattern.behavioral.command.demo01;

public class Client {
    public static void main(String[] args) {
        ICommand cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
