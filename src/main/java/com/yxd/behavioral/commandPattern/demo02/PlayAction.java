package com.yxd.behavioral.commandPattern.demo02;

/**
 * 播放指令类
 */
public class PlayAction implements IAction {
    private GPlayer gPlayer;

    public PlayAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.play();
    }
}
