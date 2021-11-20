package com.yxd.designpattern.structural.bridge.demo02;

/**
 * 邮件消息的实现类
 */
public class EmailMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件消息发送【" + message + "】给" + toUser);
    }
}
