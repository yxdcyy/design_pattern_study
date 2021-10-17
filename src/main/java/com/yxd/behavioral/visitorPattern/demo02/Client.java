package com.yxd.behavioral.visitorPattern.demo02;

public class Client {
    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("====================CEO 看报表=====================");
        report.showReport(new CEOVisitor());

        System.out.println("====================CTO 看报表=====================");
        report.showReport(new CTOVisitor());
    }
}
