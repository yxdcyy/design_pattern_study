package com.yxd.behavioral.commandPattern.demo02;

/**
 * 拖动进度条指令类
 */
public class SpeedAction implements IAction {
    private GPlayer gPlayer;

    public SpeedAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.speed();
    }
}
