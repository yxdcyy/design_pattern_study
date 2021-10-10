package com.yxd.behavioral.commandPattern.demo01;

public class Invoker {
    private ICommand cmd;

    public Invoker(ICommand cmd) {
        this.cmd = cmd;
    }

    public void action() {
        this.cmd.execute();
    }
}
