package com.gupao.vip.designpatterns.memento;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:54 2020/3/26
 **/
public class MementoCaretaker {

    private Memento memento;

    public Memento getMemento(){
        return this.memento;
    }

    public void storeMemento(Memento memento){
        this.memento = memento;
    }

}
