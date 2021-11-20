package com.yxd.designpattern.structural.decorator.demo01;

/**
 * 抽象装饰器
 */
public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 转发请求给组件对象，可以在转发前后执行一些附加动作
        component.operation();
    }
}
