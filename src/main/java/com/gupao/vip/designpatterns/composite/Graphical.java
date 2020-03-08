package com.gupao.vip.designpatterns.composite;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 18:48 2020/3/8
 **/
public abstract class Graphical {

    protected String name;

    public Graphical(String name) {
        this.name = name;
    }

    abstract public void draw();


}
