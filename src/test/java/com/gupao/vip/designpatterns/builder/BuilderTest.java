package com.gupao.vip.designpatterns.builder;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 4:56 2019/7/20
 **/
public class BuilderTest {

    public static void main(String[] args) {
        if (args.length != 1) {
            usage ();
            System.exit ( 0 );
        }
        if (args[0].equals ( "plain" )) {
            Builder textBuilder = new TextBuilder ();
            Director director = new Director ( textBuilder );
            director.construct ();
            String result = ((TextBuilder) textBuilder).getResult ();
            System.out.println ( result );
        }
        if (args[0].equals ( "html" )) {
            Builder textBuilder = new HtmlBuilder ();
            Director director = new Director ( textBuilder );
            director.construct ();
            String result = ((HtmlBuilder) textBuilder).getResult ();
            System.out.println ( result );
        } else {
            usage ();
            System.exit ( 0 );
        }

    }

    public static void usage() {
        System.out.println ( "Usage: java Main plain 编写纯文本文档" );
        System.out.println ( "Usage: java Main html 编写HTML文件" );
    }
}
