package com.gupao.vip.designpatterns.memento.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:21 2020/3/26
 **/
public class Test {

    public static void main(String[] args) {

        Editor editor = new Editor("设计模式","设计模式是开发的指导方法");
        System.out.println(editor);

        DraftBox draftBox = new DraftBox();
        draftBox.storeArticalMemento(editor.createMemento());

        editor.setContent("设计模式是开发的指导方法,能帮助我们设计更好的程序");
        draftBox.storeArticalMemento(editor.createMemento());
        System.out.println(editor);

        editor.setTitle("23种设计模式");
        draftBox.storeArticalMemento(editor.createMemento());
        System.out.println(editor);

        editor.setTitle("aaa");
        System.out.println(editor);

        editor.recoverFromMemento(draftBox.getArticalMemento());
        System.out.println(editor);

        editor.recoverFromMemento(draftBox.getArticalMemento());
        System.out.println(editor);
    }

}
