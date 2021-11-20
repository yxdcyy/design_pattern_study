package com.yxd.designpattern.behavioral.templateMethod.demo03;

public class PureSoyaMilk extends SoyaMilk {
    @Override
    public void addCondiments() {
        System.out.println("纯豆浆不需要添加配料");
    }

    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
