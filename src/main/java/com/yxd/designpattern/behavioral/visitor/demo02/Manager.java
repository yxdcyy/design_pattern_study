package com.yxd.designpattern.behavioral.visitor.demo02;

import java.util.Random;

/**
 * 经理类
 */
public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    // 一年做的新产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
