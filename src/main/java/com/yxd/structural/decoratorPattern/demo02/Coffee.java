package com.yxd.structural.decoratorPattern.demo02;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
