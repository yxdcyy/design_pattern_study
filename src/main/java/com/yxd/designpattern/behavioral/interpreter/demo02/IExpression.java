package com.yxd.designpattern.behavioral.interpreter.demo02;

/**
 * 抽象表达式接口
 */
public interface IExpression {
    // 对表达式进行解释
    // a + b - c，key:[a,b,c]，value:就是具体值 {a=10,b=20,c=30}
    int interpret(Context context);
}
