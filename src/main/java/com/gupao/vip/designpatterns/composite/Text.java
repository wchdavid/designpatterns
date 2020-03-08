package com.gupao.vip.designpatterns.composite;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 19:11 2020/3/8
 **/
public class Text extends Graphical {
    public Text(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println(this.name);
    }
}
