package com.yxd.behavioral.visitorPattern.demo03;

public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
