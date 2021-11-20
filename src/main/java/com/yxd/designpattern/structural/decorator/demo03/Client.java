package com.yxd.designpattern.structural.decorator.demo03;

public class Client {
    public static void main(String[] args) {
        Battercake battercake = null;
        // 买一个煎饼
        battercake = new BaseBattercake();
        // 煎饼有点小，想再加 1 个鸡蛋
        battercake = new EggDecorator(battercake);
        // 再加 1 个鸡蛋
        battercake = new EggDecorator(battercake);
        // 很饿，再加 1 根香肠
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() + "，总价：" + battercake.getPrice());
    }
}
