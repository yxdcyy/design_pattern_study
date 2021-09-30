package com.yxd.structural.bridgePattern.demo03;

/**
 * 旋转式
 */
public class RotatePhone extends Phone {
    public RotatePhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("旋转样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("旋转样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("旋转样式手机");
    }
}
