package com.yxd.structural.adapterPattern.demo04;

public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone,String code);
}
