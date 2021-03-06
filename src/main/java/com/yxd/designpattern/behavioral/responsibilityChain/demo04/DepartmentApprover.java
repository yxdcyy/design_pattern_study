package com.yxd.designpattern.behavioral.responsibilityChain.demo04;

/**
 * 主任审批类
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            this.nextApprover.processRequest(purchaseRequest);
        }
    }
}
