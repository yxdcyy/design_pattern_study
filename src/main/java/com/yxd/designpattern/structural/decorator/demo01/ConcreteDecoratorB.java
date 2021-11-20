package com.yxd.designpattern.structural.decorator.demo01;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    /**
     * 在调用父类的 operation() 方法之前需要执行的操作
     */
    private void operationFirst() {
        System.out.println("Called Method ConcreteDecoratorB.operation() Before...");
    }

    /**
     * 在调用父类的 operation() 方法之后需要执行的操作
     */
    private void operationLast() {
        System.out.println("Called Method ConcreteDecoratorB.operation() After...");
    }

    @Override
    public void operation() {
        operationFirst();
        super.operation();
        operationLast();
    }
}
