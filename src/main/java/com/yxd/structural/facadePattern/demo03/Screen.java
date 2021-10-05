package com.yxd.structural.facadePattern.demo03;

/**
 * 屏幕
 */
public class Screen {
    private static Screen instance = new Screen();

    private Screen(){}

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen UP");
    }

    public void down() {
        System.out.println("Screen DOWN");
    }
}
