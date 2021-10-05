package com.yxd.structural.facadePattern.demo02;

/**
 * 支付系统
 */
public class PaymentService {
    public boolean pay(GiftInfo pointGift) {
        // 扣减积分
        System.out.println("支付" + pointGift.getName() + " 积分成功");
        return true;
    }
}
