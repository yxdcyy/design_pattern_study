package com.yxd.designpattern.behavioral.responsibilityChain.demo04;

/**
 * 抽象审批者类
 */
public abstract class Approver {

    protected Approver nextApprover; // 下一个处理者

    protected String name; // 名字

    public Approver(String name) {
        this.name = name;
    }

    // 设置 下一个处理者
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    // 处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
