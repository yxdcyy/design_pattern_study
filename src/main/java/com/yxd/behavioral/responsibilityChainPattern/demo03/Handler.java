package com.yxd.behavioral.responsibilityChainPattern.demo03;

/**
 * 抽象处理类
 */
public abstract class Handler<T> {

    protected Handler chain;

    private void next(Handler handler) {
        this.chain = handler;
    }

    public abstract void doHandle(Member member);

    protected boolean isEmpty(String str) {
        if (null == str || str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;

            return this;
        }

        public Handler<T> build() {
            return this.head;
        }
    }
}
