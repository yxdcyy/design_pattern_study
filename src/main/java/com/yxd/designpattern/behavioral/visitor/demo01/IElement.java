package com.yxd.designpattern.behavioral.visitor.demo01;

/**
 * 抽象元素
 */
public interface IElement {
    void accept(IVisitor visitor);
}
