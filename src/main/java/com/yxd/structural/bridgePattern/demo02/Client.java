package com.yxd.structural.bridgePattern.demo02;

public class Client {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NomalMessage(message);
        abstractMessage.sendMessage("加班申请速批","王总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请速批","王总");

        message = new SysInnerMessage();
        abstractMessage = new SpecialUrgencyMessage(message);
        abstractMessage.sendMessage("加班申请速批","王总");
    }
}
