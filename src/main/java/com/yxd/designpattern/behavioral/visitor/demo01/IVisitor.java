package com.yxd.designpattern.behavioral.visitor.demo01;

/**
 * 抽象访问者
 */
public interface IVisitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}
