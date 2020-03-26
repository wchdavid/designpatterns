package com.gupao.vip.designpatterns.memento;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:47 2020/3/26
 **/
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
