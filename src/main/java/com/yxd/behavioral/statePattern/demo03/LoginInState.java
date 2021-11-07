package com.yxd.behavioral.statePattern.demo03;

/**
 * 登录状态类
 */
public class LoginInState extends UserState {

    @Override
    public void favorite() {
        System.out.println("收藏成功！");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }
}
