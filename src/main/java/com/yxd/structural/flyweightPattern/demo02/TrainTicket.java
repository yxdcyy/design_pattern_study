package com.yxd.structural.flyweightPattern.demo02;

import java.util.Random;

public class TrainTicket implements ITicket {
    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(String.format("%s->%s: %s 价格：%s 元", this.from, this.to, bunk, this.price));
    }
}
