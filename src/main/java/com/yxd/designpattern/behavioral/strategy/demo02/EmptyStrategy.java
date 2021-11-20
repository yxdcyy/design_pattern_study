package com.yxd.designpattern.behavioral.strategy.demo02;

/**
 * 无优惠策略
 */
public class EmptyStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
