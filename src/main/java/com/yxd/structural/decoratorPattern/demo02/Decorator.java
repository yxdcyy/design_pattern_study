package com.yxd.structural.decoratorPattern.demo02;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // getPrice() 装饰器的价格
        return getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " + " + drink.getDes();
    }
}
