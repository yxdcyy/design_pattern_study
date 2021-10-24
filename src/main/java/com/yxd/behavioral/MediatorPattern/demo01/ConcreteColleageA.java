package com.yxd.behavioral.MediatorPattern.demo01;

/**
 * 具体同事类 A
 */
public class ConcreteColleageA extends Colleage {

    public ConcreteColleageA(Mediator mediator) {
        super(mediator);
        this.getMediator().setColleageA(this);
    }

    // 自发行为：Self-Method
    public void selfMethodA() {
        // 处理自己的逻辑
        System.out.println(this.getClass().getSimpleName() + ", self-Method");
    }

    // 依赖方法：Dep-Method
    public void depMethodA() {
        // 处理自己的逻辑
        System.out.println(this.getClass().getSimpleName() + ":depMethod: delegate to Mediator");
        // 无法处理的业务逻辑委托给中介者处理
        this.getMediator().transferA();
    }
}
