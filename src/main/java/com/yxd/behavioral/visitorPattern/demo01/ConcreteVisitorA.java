package com.yxd.behavioral.visitorPattern.demo01;

/**
 * 具体访问者A
 */
public class ConcreteVisitorA implements IVisitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        String result = elementA.operationA();
        System.out.println("ConcreteVisitorA result from " + elementA.getClass().getSimpleName() + ": " + result);
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        int result = elementB.operationB();
        System.out.println("ConcreteVisitorA result from " + elementB.getClass().getSimpleName() + ": " + result);
    }
}
