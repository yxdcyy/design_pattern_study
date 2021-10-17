package com.yxd.behavioral.visitorPattern.demo01;

/**
 * 具体访问者
 */
public class ConcreteVisitorB implements IVisitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        String result = elementA.operationA();
        System.out.println("ConcreteVisitorB result from " + elementA.getClass().getSimpleName() + ": " + result);
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        int result = elementB.operationB();
        System.out.println("ConcreteVisitorB result from " + elementB.getClass().getSimpleName() + ": " + result);
    }
}
