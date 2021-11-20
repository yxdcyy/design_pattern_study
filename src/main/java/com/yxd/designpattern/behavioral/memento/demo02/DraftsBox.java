package com.yxd.designpattern.behavioral.memento.demo02;

import java.util.Stack;

/**
 * 备忘录管理角色 草稿箱
 */
public class DraftsBox {
    private final Stack<ArticleMemento> STACK = new Stack<>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = this.STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        this.STACK.push(articleMemento);
    }
}
