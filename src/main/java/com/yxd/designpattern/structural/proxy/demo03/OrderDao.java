package com.yxd.designpattern.structural.proxy.demo03;

public class OrderDao {
    public int insert(Order order) {
        System.out.println("OrderDao 创建 Order 成功！");
        return 1;
    }
}
