package com.yxd.designpattern.structural.bridge.demo02;

/**
 * 抽象消息类
 */
public abstract class AbstractMessage {
    // 持有一个实现部分的对象
    protected IMessage message;

    // 构造方法，传入实现部分的对象
    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    // 发送消息，委派给实现部分的方法
    public void sendMessage(String message, String toUser) {
        this.message.send(message,toUser);
    }
}
