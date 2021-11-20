package com.yxd.designpattern.behavioral.Mediator.demo03;

public class Client {
    public static void main(String[] args) {
        // 创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        // 创建 Alarm 并且加入到 ConcreteMediator 对象的 HashMap 中
        Alarm alarm = new Alarm(mediator, "alarm");
        // 创建 CoffeeMachine 并且加入到 ConcreteMediator 对象的 HashMap 中
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        // 创建 Curtains 并且加入到 ConcreteMediator 对象的 HashMap 中
        Curtains curtains = new Curtains(mediator, "curtains");
        // 创建 TV 并且加入到 ConcreteMediator 对象的 HashMap 中
        TV tv = new TV(mediator, "tv");

        // 让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
