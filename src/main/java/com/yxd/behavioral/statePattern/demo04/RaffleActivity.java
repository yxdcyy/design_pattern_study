package com.yxd.behavioral.statePattern.demo04;

/**
 * 抽奖活动
 */
public class RaffleActivity {

    // 表示活动当前的状态，是变化
    private ActivityState state = null;
    // 奖品数量
    private int count = 0;

    // 四个属性，表示四种状态
    private ActivityState noRafflleState = new NoRaffleState(this);
    private ActivityState canRaffleState = new CanRaffleState(this);
    private ActivityState dispenseState =   new DispenseState(this);
    private ActivityState dispensOutState = new DispenseOutState(this);

    /**
     * 1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
     * 2. 初始化奖品的数量
     * @param count
     */
    public RaffleActivity(int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    /**
     * 扣积分
     */
    public void debuctMoney() {
        this.state.deductMoney();
    }

    /**
     * 抽奖
     */
    public void raffle() {
        // 如果当前的状态是抽奖成功
        if (this.state.raffle()) {
            // 领取奖品
            this.state.dispensePrize();
        }
    }

    public ActivityState getState() {
        return state;
    }

    public void setState(ActivityState state) {
        this.state = state;
    }

    // 每领取一次奖品，count--
    public int getCount() {
        return count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ActivityState getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(ActivityState noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public ActivityState getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(ActivityState canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public ActivityState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(ActivityState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public ActivityState getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(ActivityState dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
}
