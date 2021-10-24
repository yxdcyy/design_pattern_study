package com.yxd.behavioral.mementoPattern.demo01;

public class Client {
    public static void main(String[] args) {
        // 创建一个发起人角色
        Originator originator = new Originator();
        originator.setState("111");
        // 创建一个备忘录管理员角色
        Caretaker caretaker = new Caretaker();
        // 管理员存储发起人的备忘录
        caretaker.storeMemento(originator.createMemento());
        System.out.println("当前状态：" + originator.getState());
        System.out.println("=======重置状态============");
        originator.setState("222");
        System.out.println("当前状态：" + originator.getState());
        System.out.println("=======回滚状态============");
        // 发起人从管理员获取备忘录进行回滚
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("当前状态：" + originator.getState());
    }
}
