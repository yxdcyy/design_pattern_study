package com.yxd.designpattern.behavioral.state.demo03;

public class Client {
    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("评论：好文章，360个赞！");
    }
}
