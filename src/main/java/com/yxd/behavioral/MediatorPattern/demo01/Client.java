package com.yxd.behavioral.MediatorPattern.demo01;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleageA colleageA = new ConcreteColleageA(mediator);
        ConcreteColleageB colleageB = new ConcreteColleageB(mediator);
        colleageA.depMethodA();
        System.out.println("========================");
        colleageB.depMethodB();
    }
}
