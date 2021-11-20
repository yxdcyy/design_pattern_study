package com.yxd.designpattern.behavioral.responsibilityChain.demo03;

public class MemberService {
    public void login(String loginName, String loginPass) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandle(new Member(loginName,loginPass,""));
    }
}
