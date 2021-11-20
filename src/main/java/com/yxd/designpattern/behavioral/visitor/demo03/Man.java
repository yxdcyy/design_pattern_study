package com.yxd.designpattern.behavioral.visitor.demo03;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
