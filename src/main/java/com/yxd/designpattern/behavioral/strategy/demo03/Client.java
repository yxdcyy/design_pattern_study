package com.yxd.designpattern.behavioral.strategy.demo03;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("1", "20211114161815", 324.5);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
