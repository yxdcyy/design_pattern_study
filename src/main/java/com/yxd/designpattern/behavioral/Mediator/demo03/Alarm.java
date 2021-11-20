package com.yxd.designpattern.behavioral.Mediator.demo03;

/**
 * 具体同事类 Alarm
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.getName());
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }
}
