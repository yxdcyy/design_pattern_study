package com.yxd.designpattern.behavioral.responsibilityChain.demo03;

/**
 * 登录校验类
 */
public class LoginHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        chain.doHandle(member);
    }
}
