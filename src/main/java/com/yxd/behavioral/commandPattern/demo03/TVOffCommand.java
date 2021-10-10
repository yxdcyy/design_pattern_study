package com.yxd.behavioral.commandPattern.demo03;

/**
 * 电视关闭命令类
 */
public class TVOffCommand implements ICommand {
    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
