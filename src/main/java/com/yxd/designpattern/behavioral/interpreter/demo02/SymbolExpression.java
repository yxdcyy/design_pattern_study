package com.yxd.designpattern.behavioral.interpreter.demo02;

/**
 * 抽象运算符号解析器
 * 每个运算符号，都只和自己左右两个数字有关系，但左右两个数字有可能也是一个解析的结果，无论何种类型，都是 IExpression 接口的实现类
 */
public abstract class SymbolExpression implements IExpression {
    protected IExpression left;
    protected IExpression right;

    public SymbolExpression(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }
}
