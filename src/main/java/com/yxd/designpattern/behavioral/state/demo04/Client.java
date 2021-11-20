package com.yxd.designpattern.behavioral.state.demo04;

public class Client {
    public static void main(String[] args) {
        // 创建活动对象，奖品数量 1
        RaffleActivity activity = new RaffleActivity(2);

        for (int i = 0; i < 10; i++) {
            if (activity.getState() instanceof DispenseOutState) {
                break;
            }

            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            // 抽奖
            activity.raffle();
        }
    }
}
