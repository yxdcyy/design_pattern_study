package com.yxd.behavioral.visitorPattern.demo01;

/**
 * 抽象元素
 */
public interface IElement {
    void accept(IVisitor visitor);
}
