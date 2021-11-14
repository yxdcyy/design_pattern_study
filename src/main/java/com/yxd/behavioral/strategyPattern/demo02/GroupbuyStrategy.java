package com.yxd.behavioral.strategyPattern.demo02;

/**
 * 拼团优惠策略类
 */
public class GroupbuyStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
