package com.yxd.designpattern.behavioral.visitor.demo02;

/**
 * CEO 访问者
 */
public class CEOVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + "，KPI：" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + "，KPI：" + manager.kpi + "，新产品数量：" + manager.getProducts());
    }
}
