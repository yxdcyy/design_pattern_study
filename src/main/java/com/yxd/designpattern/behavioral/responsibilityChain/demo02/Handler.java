package com.yxd.designpattern.behavioral.responsibilityChain.demo02;

/**
 * 抽象处理类
 */
public abstract class Handler {

    protected Handler chain;

    public void next(Handler handler) {
        this.chain = handler;
    }

    public abstract void doHandle(Member member);

    protected boolean isEmpty(String str) {
        if (null == str || str.trim().length() == 0) {
            return true;
        }
        return false;
    }
}
