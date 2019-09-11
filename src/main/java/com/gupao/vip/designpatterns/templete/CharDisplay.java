package com.gupao.vip.designpatterns.templete;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:41 2019/7/7
 **/
public class CharDisplay extends AbsDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
