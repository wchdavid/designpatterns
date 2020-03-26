package com.gupao.vip.designpatterns.memento;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:58 2020/3/26
 **/
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        MementoCaretaker caretaker = new MementoCaretaker();

        caretaker.storeMemento(originator.createMemento());
        originator.recoverFromMemento(caretaker.getMemento());
    }

}
