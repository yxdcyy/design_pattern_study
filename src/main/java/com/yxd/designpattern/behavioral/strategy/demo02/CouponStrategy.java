package com.yxd.designpattern.behavioral.strategy.demo02;

/**
 * 优惠券抵扣策略类
 */
public class CouponStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
