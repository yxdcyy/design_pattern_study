package com.yxd.designpattern.behavioral.interpreter.demo02;

/**
 * 变量的解释器
 */
public class VarExpression implements IExpression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    // 根据变量名称，返回对应值
    @Override
    public int interpret(Context context) {
        return context.get(this.key);
    }
}
