package com.yxd.designpattern.behavioral.state.demo04;

/**
 * 不能抽奖状态
 */
public class NoRaffleState extends ActivityState {

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 当前状态可以扣积分，扣除后，将状态设置成可以抽奖状态
     */
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    // 当前状态不能发奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
