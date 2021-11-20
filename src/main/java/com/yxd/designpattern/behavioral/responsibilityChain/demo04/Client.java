package com.yxd.designpattern.behavioral.responsibilityChain.demo04;

public class Client {
    public static void main(String[] args) {
        // 创建一个请求
        PurchaseRequest request = new PurchaseRequest(1, 31000, 1);

        // 创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");

        // 需要将各个审批级别的下一个设置好 (处理人构成环形: )
        departmentApprover.setNextApprover(collegeApprover);
        collegeApprover.setNextApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setNextApprover(schoolMasterApprover);
        schoolMasterApprover.setNextApprover(departmentApprover);

        departmentApprover.processRequest(request);
    }
}
