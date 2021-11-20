package com.yxd.designpattern.structural.bridge.demo02;

public class SpecialUrgencyMessage extends AbstractMessage {
    // 构造方法，传入实现部分的对象
    public SpecialUrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "特急：" + message;
        super.sendMessage(message, toUser);
    }
}
