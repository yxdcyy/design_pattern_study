package com.yxd.designpattern.behavioral.strategy.demo02;

/**
 * 促销活动方案类
 */
public class PromotionActivity {

    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.doPromotion();
    }
}
