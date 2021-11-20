package com.yxd.behavioral.responsibilityChainPattern.demo03;

/**
 * 成员类
 */
public class Member {
    private String loginName;
    private String loginPass;
    private String roleName;

    public Member(String loginName, String loginPass, String roleName) {
        this.loginName = loginName;
        this.loginPass = loginPass;
        this.roleName = roleName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "loginName='" + loginName + '\'' +
                ", loginPass='" + loginPass + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
