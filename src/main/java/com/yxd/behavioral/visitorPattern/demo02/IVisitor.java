package com.yxd.behavioral.visitorPattern.demo02;

/**
 * 抽象访问者
 */
public interface IVisitor {
    // 访问工程师类型
    void visit(Engineer engineer);

    // 访问经理类型
    void visit(Manager manager);
}
