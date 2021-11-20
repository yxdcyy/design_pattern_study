package com.yxd.designpattern.structural.facade.demo02;

public class Client {
    public static void main(String[] args) {
        GiftInfo giftInfo = new GiftInfo("《Spring 5 核心原理》");
        GiftFacadeService giftFacadeService = new GiftFacadeService();
        giftFacadeService.exchange(giftInfo);
    }
}
