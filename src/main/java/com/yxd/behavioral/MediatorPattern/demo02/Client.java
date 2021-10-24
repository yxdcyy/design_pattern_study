package com.yxd.behavioral.MediatorPattern.demo02;

public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User tom = new User("Tom", chatRoom);
        User jerry = new User("Jerry", chatRoom);

        tom.sendMessage("Hi! I am Tom.");
        jerry.sendMessage("Hello! My name is Jerry.");
    }
}
