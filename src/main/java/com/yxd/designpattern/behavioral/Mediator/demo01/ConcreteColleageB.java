package com.yxd.designpattern.behavioral.Mediator.demo01;

/**
 * 具体同事类 B
 */
public class ConcreteColleageB extends Colleage {

    public ConcreteColleageB(Mediator mediator) {
        super(mediator);
        this.getMediator().setColleageB(this);
    }

    // 自发行为：Self-Method
    public void selfMethodB() {
        // 处理自己的逻辑
        System.out.println(this.getClass().getSimpleName() + ", self-Method");
    }

    // 依赖方法：Dep-Method
    public void depMethodB() {
        // 处理自己的逻辑
        System.out.println(this.getClass().getSimpleName() + ":depMethod: delegate to Mediator");
        // 无法处理的业务逻辑委托给中介者处理
        this.getMediator().transferB();
    }
}
