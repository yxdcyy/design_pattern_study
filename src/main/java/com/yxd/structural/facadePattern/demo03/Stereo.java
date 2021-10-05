package com.yxd.structural.facadePattern.demo03;

/**
 * 立体声音响
 */
public class Stereo {
    private static Stereo instance = new Stereo();

    private Stereo(){}

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo ON");
    }

    public void off() {
        System.out.println("Stereo OFF");
    }

    public void up() {
        System.out.println("Stereo UP");
    }
}
