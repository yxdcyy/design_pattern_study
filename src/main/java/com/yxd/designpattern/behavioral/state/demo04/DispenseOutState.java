package com.yxd.designpattern.behavioral.state.demo04;

/**
 * 奖品发放完毕状态
 * 当 activity 改变成 DispenseOutState， 抽奖活动结束
 */
public class DispenseOutState extends ActivityState {

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
