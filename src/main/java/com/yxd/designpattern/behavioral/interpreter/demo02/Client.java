package com.yxd.designpattern.behavioral.interpreter.demo02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr(); // a+b
        Context context = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(context));
    }

    // 获得表达式
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    // 获得值映射
    public static Context getValue(String expStr) throws IOException {
        Context context = new Context();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!context.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + String.valueOf(ch) + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    context.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return context;
    }
}
