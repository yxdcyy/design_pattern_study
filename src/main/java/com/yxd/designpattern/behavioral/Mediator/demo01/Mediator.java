package com.yxd.designpattern.behavioral.Mediator.demo01;

/**
 * 抽象中介者
 */
public abstract class Mediator {
    private ConcreteColleageA colleageA;
    private ConcreteColleageB colleageB;

    public ConcreteColleageA getColleageA() {
        return colleageA;
    }

    public void setColleageA(ConcreteColleageA colleageA) {
        this.colleageA = colleageA;
    }

    public ConcreteColleageB getColleageB() {
        return colleageB;
    }

    public void setColleageB(ConcreteColleageB colleageB) {
        this.colleageB = colleageB;
    }



    // 中介者业务逻辑
    public abstract void transferA();

    public abstract void transferB();
}
