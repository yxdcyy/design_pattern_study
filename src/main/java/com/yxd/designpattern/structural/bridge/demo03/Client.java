package com.yxd.designpattern.structural.bridge.demo03;

public class Client {
    public static void commonCall(Phone phone) {
        phone.open();
        phone.call();
        phone.close();
    }

    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        commonCall(phone);
        System.out.println("---------------------------------");

        phone = new FoldedPhone(new HuaWei());
        commonCall(phone);
        System.out.println("---------------------------------");

        phone = new RotatePhone(new Vivo());
        commonCall(phone);
        System.out.println("---------------------------------");
    }
}
