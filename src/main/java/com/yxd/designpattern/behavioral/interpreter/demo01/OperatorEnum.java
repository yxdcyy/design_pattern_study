package com.yxd.designpattern.behavioral.interpreter.demo01;

public enum OperatorEnum {
    LEFT_BRACKET("("), RIGHT_BRACKET(")"), SUB("-"), ADD("+"), MULTI("*"), DIV("/");

    private String operator;

    OperatorEnum(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
