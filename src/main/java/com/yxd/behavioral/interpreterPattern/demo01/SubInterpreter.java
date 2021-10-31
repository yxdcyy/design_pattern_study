package com.yxd.behavioral.interpreterPattern.demo01;

/**
 * 非终结符表达式：减
 */
public class SubInterpreter extends Interpreter {

    public SubInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
