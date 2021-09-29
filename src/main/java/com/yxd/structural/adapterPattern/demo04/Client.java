package com.yxd.structural.adapterPattern.demo04;

public class Client {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.login("tom", "123456");
        adapter.loginForQQ("abcdefg1234567");
        adapter.loginForWechat("ABCDEFG1234567");
    }
}
