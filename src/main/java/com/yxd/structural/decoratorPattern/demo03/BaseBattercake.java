package com.yxd.structural.decoratorPattern.demo03;

/**
 * 基础套餐
 */
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected float getPrice() {
        return 5.0f;
    }
}
