package com.yxd.behavioral.responsibilityChainPattern.demo02;

/**
 * 权限校验类
 */
public class AuthHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("您是管理员，允许操作");
    }
}
