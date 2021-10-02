package com.yxd.structural.decoratorPattern.demo03;

/**
 * 鸡蛋装饰器
 */
public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " +1 个鸡蛋";
    }

    @Override
    protected float getPrice() {
        return super.getPrice() + 1.0f;
    }
}
