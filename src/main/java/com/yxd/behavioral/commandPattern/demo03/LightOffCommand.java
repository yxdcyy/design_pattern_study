package com.yxd.behavioral.commandPattern.demo03;

/**
 * 电灯关闭命令类
 */
public class LightOffCommand implements ICommand {
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        lightReceiver.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        lightReceiver.on();
    }
}
