package com.yxd.designpattern.structural.bridge.demo02;

/**
 * 系统内消息的实现类
 */
public class SysInnerMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用系统内消息发送【" + message + "】给" + toUser);
    }
}
