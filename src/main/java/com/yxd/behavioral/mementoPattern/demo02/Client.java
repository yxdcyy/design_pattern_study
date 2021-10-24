package com.yxd.behavioral.mementoPattern.demo02;

public class Client {
    public static void main(String[] args) {
        DraftsBox draftsBox = new DraftsBox();

        Editor editor = new Editor("我是这样手写 Spring 的，麻雀虽小五脏俱全",
                "本文节选自《Spring5 核心原理与30个类手写实战》一书，Tom著，电子工业出版社出版。",
                "11112222333344445555.png");

        ArticleMemento articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("标题：" + editor.getTitle() + "\n" +
                           "内容：" + editor.getContent() + "\n" +
                           "插图：" + editor.getImgs() + "\n暂存成功");
        System.out.println("完整的信息" + editor);

        System.out.println("=================首次修改文章====================");
        editor.setTitle("【Tom原创】我是这样手写 Spring 的，麻雀虽小五脏俱全");
        editor.setContent("本文节选自《Spring5 核心原理与30个类手写实战》一书，Tom著");
        System.out.println("=================首次修改文章完成=====================");
        System.out.println("完整的信息" + editor);
        articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("===============保存到草稿箱================");

        System.out.println("=================第2次修改文章====================");
        editor.setTitle("手写 Spring");
        editor.setContent("本文节选自《Spring5 核心原理与30个类手写实战》一书，Tom著");
        System.out.println("完整的信息" + editor);
        System.out.println("=================第2次修改文章完成====================");

        System.out.println("=================第1次撤销====================");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("完整的信息" + editor);
        System.out.println("=================第1次撤销完成====================");

        System.out.println("=================第2次撤销====================");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("完整的信息" + editor);
        System.out.println("=================第2次撤销完成====================");
    }
}
