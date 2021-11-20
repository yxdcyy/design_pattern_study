package com.yxd.designpattern.behavioral.strategy.demo02;


public class Client {
    public static void main(String[] args) {

        PromotionActivity promotionActivity = null;

        String promotionKey = "COUPON";

        if (MyStringUtils.equals(promotionKey, "COUPON")) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if (MyStringUtils.equals(promotionKey, "CASHBACK")) {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        } else if (MyStringUtils.equals(promotionKey, "GROUPBUY")) {
            promotionActivity = new PromotionActivity(new GroupbuyStrategy());
        } else {
            promotionActivity = new PromotionActivity(new EmptyStrategy());
        }

        promotionActivity.execute();
    }
}
