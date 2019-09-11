package com.gupao.vip.designpatterns.templete;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:51 2019/7/7
 **/
public class TempleteTest{

    public static void main(String[] args) {
        AbsDisplay charDisplay = new CharDisplay ( 'h' );
        charDisplay.display ();
        AbsDisplay stringDisplay = new StringDisplay ( "hello word" );
        stringDisplay.display ();

    }

}
