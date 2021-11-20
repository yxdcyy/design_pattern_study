package com.yxd.designpattern.behavioral.strategy.demo03;

/**
 * 支付宝支付类
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
