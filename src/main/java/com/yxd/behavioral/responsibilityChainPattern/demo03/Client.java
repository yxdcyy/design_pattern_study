package com.yxd.behavioral.responsibilityChainPattern.demo03;

public class Client {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("tom","666");
    }
}
