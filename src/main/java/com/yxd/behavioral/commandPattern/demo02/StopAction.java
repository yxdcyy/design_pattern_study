package com.yxd.behavioral.commandPattern.demo02;

/**
 * 停止播放指令类
 */
public class StopAction implements IAction {
    private GPlayer gPlayer;

    public StopAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.stop();
    }
}
