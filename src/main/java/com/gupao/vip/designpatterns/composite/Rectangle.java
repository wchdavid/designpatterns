package com.gupao.vip.designpatterns.composite;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 19:12 2020/3/8
 **/
public class Rectangle extends Graphical {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println(this.name);
    }
}
