package com.yxd.structural.decoratorPattern.demo01;

/**
 * 具体组件
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("处理业务逻辑");
    }
}
