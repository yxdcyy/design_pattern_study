package com.yxd.designpattern.structural.facade.demo03;

/**
 * 影院灯光
 */
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    private TheaterLight(){}

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("TheaterLight ON");
    }

    public void off() {
        System.out.println("TheaterLight OFF");
    }

    public void dim() {
        System.out.println("TheaterLight dim");
    }

    public void bright() {
        System.out.println("TheaterLight bright");
    }
}
