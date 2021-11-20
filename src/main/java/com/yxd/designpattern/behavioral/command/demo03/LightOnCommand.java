package com.yxd.designpattern.behavioral.command.demo03;

/**
 * 电灯打开命令类
 */
public class LightOnCommand implements ICommand {
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        lightReceiver.off();
    }
}
