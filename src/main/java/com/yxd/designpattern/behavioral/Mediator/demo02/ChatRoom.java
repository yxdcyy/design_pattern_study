package com.yxd.designpattern.behavioral.Mediator.demo02;

public class ChatRoom {
    public void showMsg(User user, String msg) {
        System.out.println("[" + user.getName() + "]:" + msg);
    }
}
