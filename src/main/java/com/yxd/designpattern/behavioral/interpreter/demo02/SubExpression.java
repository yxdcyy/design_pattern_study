package com.yxd.designpattern.behavioral.interpreter.demo02;

/**
 * 减法解释器
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(IExpression left, IExpression right) {
        super(left, right);
    }

    // 处理相减
    @Override
    public int interpret(Context context) {
        return super.left.interpret(context) - super.right.interpret(context);
    }
}
