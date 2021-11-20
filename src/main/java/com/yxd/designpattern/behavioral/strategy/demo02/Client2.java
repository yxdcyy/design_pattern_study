package com.yxd.designpattern.behavioral.strategy.demo02;

public class Client2 {
    public static void main(String[] args) {
        PromotionStrategyFactory.getPromotionKeys();
        String promotionKey = "COUPON";
        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
