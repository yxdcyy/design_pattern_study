package com.yxd.behavioral.strategyPattern.demo03;

/**
 * 微信支付类
 */
public class WechatPay extends Payment {

    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 263;
    }
}
