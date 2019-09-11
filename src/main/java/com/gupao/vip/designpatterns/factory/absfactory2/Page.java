package com.gupao.vip.designpatterns.factory.absfactory2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 11:40 2019/7/20
 **/
public abstract class Page {

    protected String title;
    protected String author;
    protected List <Item> content = new ArrayList <> ();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add ( item );
    }

    public final void outPut() {
        File file = new File ( "E:\\absFactoryDemo.html" );
        PrintWriter writer = null;
        try {
            writer = new PrintWriter ( new FileWriter ( file ) );
        } catch ( IOException e ) {
            e.printStackTrace ();
        }

        writer.write ( this.makeHtml () );
        writer.close ();
    }

    public abstract String makeHtml();
}
