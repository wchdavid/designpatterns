package com.gupao.vip.designpatterns.composite;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 19:06 2020/3/8
 **/
public class Line extends Graphical{

    public Line(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println(this.name);
    }
}
