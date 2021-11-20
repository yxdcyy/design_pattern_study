package com.yxd.designpattern.structural.decorator.demo01;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 在调用父类的 operation() 方法之前需要执行的操作
     */
    private void operationFirst() {
        System.out.println("Called Method ConcreteDecoratorA.operation() Before...");
    }

    /**
     * 在调用父类的 operation() 方法之后需要执行的操作
     */
    private void operationLast() {
        System.out.println("Called Method ConcreteDecoratorA.operation() After...");
    }

    @Override
    public void operation() {
        operationFirst();
        super.operation();
        operationLast();
    }
}
