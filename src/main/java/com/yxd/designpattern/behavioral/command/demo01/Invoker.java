package com.yxd.designpattern.behavioral.command.demo01;

public class Invoker {
    private ICommand cmd;

    public Invoker(ICommand cmd) {
        this.cmd = cmd;
    }

    public void action() {
        this.cmd.execute();
    }
}
