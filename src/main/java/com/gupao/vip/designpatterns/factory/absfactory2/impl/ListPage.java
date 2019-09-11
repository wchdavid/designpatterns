package com.gupao.vip.designpatterns.factory.absfactory2.impl;

import com.gupao.vip.designpatterns.factory.absfactory2.Item;
import com.gupao.vip.designpatterns.factory.absfactory2.Page;

import java.util.Iterator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 11:55 2019/7/20
 **/
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super ( title, author );
    }

    @Override
    public String makeHtml() {
        StringBuffer pageHtml = new StringBuffer ();

        pageHtml.append ( "<html><head><title>" + title + "</title></head>" );
        pageHtml.append ( "<body>\n" );
        pageHtml.append ( "<h1>" + title + "<h1>\n" );
        pageHtml.append ( "<url>\n" );
        Iterator iter = content.iterator ();
        while (iter.hasNext ()) {
            Item item = (ListTray) iter.next ();
            pageHtml.append ( item.makeHtml () );
        }
        pageHtml.append ( "</url>\n" );
        pageHtml.append ( "<hr><address>" + author + "</address>" );
        pageHtml.append ( "</body></html>\n" );
        return pageHtml.toString ();
    }
}
