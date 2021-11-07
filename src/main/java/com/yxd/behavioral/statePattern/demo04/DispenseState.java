package com.yxd.behavioral.statePattern.demo04;

/**
 * 发放奖品的状态
 */
public class DispenseState extends ActivityState {

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        int currentCnt = this.activity.getCount();
        if (currentCnt > 0) {

            System.out.println("恭喜您中奖了");
            // 改变状态为不能抽奖
            this.activity.setState(this.activity.getNoRafflleState());
            if (--currentCnt <= 0) {
                System.out.println("您中的是最后一份奖品！！！");
                this.activity.setState(this.activity.getDispensOutState());
            }
        } else {
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            this.activity.setState(this.activity.getDispensOutState());
        }
    }
}
