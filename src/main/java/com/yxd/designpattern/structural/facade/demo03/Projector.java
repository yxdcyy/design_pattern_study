package com.yxd.designpattern.structural.facade.demo03;

/**
 * 投影仪
 */
public class Projector {
    private static Projector instance = new Projector();

    private Projector(){}

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector ON");
    }

    public void off() {
        System.out.println("Projector OFF");
    }

    public void focus() {
        System.out.println("Projector is focus");
    }
}
