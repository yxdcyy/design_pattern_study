package com.yxd.behavioral.strategyPattern.demo03;

/**
 * 支付完成以后的状态
 */
public class MsgResult {

    private int code;

    private Object data;

    private String msg;

    public MsgResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
