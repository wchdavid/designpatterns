package com.gupao.vip.designpatterns.bridge;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 20:38 2020/3/11
 **/
public class Test {

    public static void main(String[] args) {
        IDisplay iDisplay = new DisplayImpl();

        AbsDisplay baseDisplay = new BaseDisplay(iDisplay);
        baseDisplay.disPlay();

        System.out.println("++++++++++++++++++++++++");
        AbsDisplay countDisplay = new CountDisplay(iDisplay,5);
        countDisplay.disPlay();


    }

}
