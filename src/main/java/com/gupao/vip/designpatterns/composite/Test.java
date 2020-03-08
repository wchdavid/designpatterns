package com.gupao.vip.designpatterns.composite;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 19:13 2020/3/8
 **/
public class Test {

    public static void main(String[] args) {

        Graphical l1 = new Line("线条1");
        Graphical t1 = new Text("文本1");
        Graphical r1 = new Rectangle("矩形1");
        Picture p2 = new Picture("图片2",2);

        Graphical l2 = new Line("线条2");
        Graphical t2 = new Text("文本2");
        Graphical r2 = new Rectangle("矩形2");

        p2.add(l2);
        p2.add(t2);
        p2.add(r2);

        Picture p1 = new Picture("图片1",1);

        p1.add(l1);
        p1.add(t1);
        p1.add(r1);
        p1.add(p2);

        p1.draw();

    }

}
