package com.yxd.behavioral.visitorPattern.demo02;

import java.util.Random;

/**
 * 工程师类
 */
public class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    // 工程师一年的代码量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
