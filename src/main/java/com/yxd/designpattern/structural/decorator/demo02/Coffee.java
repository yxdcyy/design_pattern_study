package com.yxd.designpattern.structural.decorator.demo02;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
