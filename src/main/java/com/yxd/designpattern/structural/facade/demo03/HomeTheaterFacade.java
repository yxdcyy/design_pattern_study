package com.yxd.designpattern.structural.facade.demo03;

/**
 * 家庭影院门面类
 */
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        dvdPlayer = DVDPlayer.getInstance();
        popcorn = Popcorn.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        stereo = Stereo.getInstance();
        theaterLight = TheaterLight.getInstance();
    }

    /**
     * 准备
     */
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    /**
     * 播放
     */
    public void play() {
        dvdPlayer.play();
    }

    /**
     * 暂停
     */
    public void pause() {
        dvdPlayer.pause();
    }

    /**
     * 结束
     */
    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
