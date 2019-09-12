package com.gupao.vip.designpatterns.templete;

/**
 * @Author wangchunhui
 * @Description //模板设计模式
 * @Date 23:38 2019/7/7
 **/
public abstract class AbsDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    protected final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
