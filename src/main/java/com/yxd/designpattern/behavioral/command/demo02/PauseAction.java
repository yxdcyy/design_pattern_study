package com.yxd.designpattern.behavioral.command.demo02;

/**
 * 暂停指令类
 */
public class PauseAction implements IAction {
    private GPlayer gPlayer;

    public PauseAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.pause();
    }
}
