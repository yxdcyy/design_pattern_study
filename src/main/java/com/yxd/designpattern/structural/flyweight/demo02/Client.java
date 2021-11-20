package com.yxd.designpattern.structural.flyweight.demo02;

public class Client {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("太原南", "北京西");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicket("太原南", "北京西");
        ticket.showInfo("硬座");
    }
}
