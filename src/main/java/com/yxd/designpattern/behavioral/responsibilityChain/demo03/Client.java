package com.yxd.designpattern.behavioral.responsibilityChain.demo03;

public class Client {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("tom","666");
    }
}
