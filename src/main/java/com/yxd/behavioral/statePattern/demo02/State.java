package com.yxd.behavioral.statePattern.demo02;

/**
 * 抽象状态类
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle();
}
