package com.yxd.designpattern.structural.bridge.demo03;

/**
 * 折叠式
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
