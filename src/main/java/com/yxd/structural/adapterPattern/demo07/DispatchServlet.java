package com.yxd.structural.adapterPattern.demo07;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public void doDispatch(Controller controller) {
        // 得到对应适配器
        HandlerAdapter adapter = getHandler(controller);
        // 通过适配器执行对应的controller对应方法
        adapter.handle(controller);
    }

    public HandlerAdapter getHandler(Controller controller) {
        // 遍历：根据得到的controller(handler), 返回对应适配器
        for (HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }
}
