package com.yxd.behavioral.responsibilityChainPattern.demo03;

/**
 * 非空校验
 */
public class ValidateHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        if (isEmpty(member.getLoginName()) || isEmpty(member.getLoginPass())) {
            System.out.println("用户名或者密码为空");
            return;
        }
        System.out.println("用户名和密码校验成功，可以往下执行");
        chain.doHandle(member);
    }
}
