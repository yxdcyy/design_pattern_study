package com.yxd.behavioral.commandPattern.demo01;

public class ConcreteCommand implements ICommand {
    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        this.receiver.action();
    }
}
