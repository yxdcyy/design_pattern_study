package com.yxd.designpattern.behavioral.templateMethod.demo03;

public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    public void addCondiments() {
        System.out.println("第三步：加入上好的花生");
    }
}
