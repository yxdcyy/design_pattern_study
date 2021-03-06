package com.yxd.designpattern.behavioral.visitor.demo01;

/**
 * 具体元素A
 */
public class ConcreteElementA implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return this.getClass().getSimpleName();
    }
}
