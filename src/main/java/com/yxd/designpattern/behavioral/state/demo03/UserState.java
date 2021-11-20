package com.yxd.designpattern.behavioral.state.demo03;

/**
 * 抽象状态角色
 */
public abstract class UserState {
    protected AppContext context;

    public void setContext(AppContext context) {
        this.context = context;
    }

    // 收藏
    public abstract void favorite();

    // 评论
    public abstract void comment(String comment);
}
