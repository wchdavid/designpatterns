package com.gupao.vip.designpatterns.templete;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:43 2019/7/7
 **/
public class StringDisplay extends AbsDisplay {
    private int width;
    private String string;

    public StringDisplay(String string) {
        this.width = string.length();
        this.string = string;
    }

    @Override
    public void open() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
