package com.yxd.behavioral.strategyPattern.demo03;

/**
 * 京东白条支付类
 */
public class JDPay extends Payment {

    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
