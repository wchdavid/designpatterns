package com.gupao.vip.designpatterns.memento;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:46 2020/3/26
 **/
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void recoverFromMemento(Memento memento) {
        this.state = memento.getState();
    }

}
