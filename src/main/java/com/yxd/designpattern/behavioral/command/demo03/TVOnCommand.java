package com.yxd.designpattern.behavioral.command.demo03;

/**
 * 电视打开命令类
 */
public class TVOnCommand implements ICommand {
    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
