package com.yxd.designpattern.behavioral.state.demo04;

/**
 * 抽象活动状态
 */
public abstract class ActivityState {

    protected RaffleActivity activity;

    public void setActivity(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 扣除积分 - 50
     */
    public abstract void deductMoney();

    /**
     * 是否抽中奖品
     * @return
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrize();
}
