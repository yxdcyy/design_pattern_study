package com.yxd.designpattern.behavioral.interpreter.demo02;

import java.util.Stack;

/**
 * 计算器类
 */
public class Calculator {
    // 定义表达式
    private IExpression expression;

    public Calculator(String expStr) {
        this.parse(expStr);
    }

    private void parse(String expStr) { // 如：a + b
        // 安排运算先后顺序
        Stack<IExpression> stack = new Stack<>();
        // 表达式拆分成字符数组
        char[] charArray = expStr.toCharArray(); // 如：[a,+,b]

        IExpression left = null;
        IExpression right = null;

        // 遍历我们的字符数组， 即遍历  [a, +, b]
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop(); // 从stack取出left => "a"
                    right = new VarExpression(String.valueOf(charArray[++i])); // 取出右表达式 "b"
                    stack.push(new AddExpression(left, right)); // 然后根据得到left 和 right 构建 AddExpresson加入stack
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    // 如果是 var，就创建 VarExpression，并压入栈中
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        // 当遍历完整个 charArray 数组后，stack 就得到最后 Expression
        this.expression = stack.pop();
    }

    public int run(Context context) {
        return this.expression.interpret(context);
    }
}
