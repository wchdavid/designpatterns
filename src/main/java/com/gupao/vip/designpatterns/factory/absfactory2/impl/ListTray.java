package com.gupao.vip.designpatterns.factory.absfactory2.impl;

import com.gupao.vip.designpatterns.factory.absfactory2.Item;
import com.gupao.vip.designpatterns.factory.absfactory2.Tray;

import java.util.Iterator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 11:54 2019/7/20
 **/
public class ListTray extends Tray {
    public ListTray(String caption) {
        super ( caption );
    }

    @Override
    public String makeHtml() {
        StringBuffer trayHtml = new StringBuffer ();
        trayHtml.append ( "<li>\n" );
        trayHtml.append ( caption + "\n" );
        trayHtml.append ( "<url>\n" );

        Iterator iter = tray.iterator ();
        while (iter.hasNext ()) {
            Item item = (ListLink) iter.next ();
            trayHtml.append ( item.makeHtml () );
        }
        trayHtml.append ( "</url>\n" );
        trayHtml.append ( "</li>\n" );
        return trayHtml.toString ();
    }

}
