package com.yxd.designpattern.behavioral.Mediator.demo03;

/**
 * 具体同事类 CoffeeMachine
 */
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.getName());
    }

    public void startCoffee() {
        System.out.println("It's time to start Coffee Machine!");
    }

    public void finishCoffee() {
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }
}
