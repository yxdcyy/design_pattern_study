package com.yxd.designpattern.structural.adapter.demo05;

public class AbstractAdapter extends PassportService implements ILoginAdapter {

    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
