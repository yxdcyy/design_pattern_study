package com.yxd.designpattern.behavioral.delegate.demo02;

public class Boss {
    public void command(String task, Leader leader) {
        leader.doing(task);
    }
}
