package com.yxd.designpattern.behavioral.interpreter.demo02;

/**
 * 加法解释器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(IExpression left, IExpression right) {
        super(left, right);
    }

    // 处理相加
    @Override
    public int interpret(Context context) {
        return super.left.interpret(context) + super.right.interpret(context);
    }
}
