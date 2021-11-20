package com.yxd.designpattern.structural.adapter.demo05;

public class LoginForWechatAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id, null);
    }
}
