package com.gupao.vip.designpatterns.factory.absfactory2;

import com.gupao.vip.designpatterns.factory.absfactory2.impl.ListPageFactory;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 12:29 2019/7/20
 **/
public class AbsFactoryTest {

    public static void main(String[] args) {
        PageFctory pageFctory = PageFctory.getPageFactory ( ListPageFactory.class );

        Link link1 = pageFctory.createLink ( "人民日报", "http://www.people.com.cn" );
        Link link2 = pageFctory.createLink ( "光明日报", "http://www.gmw.cn" );

        Link link3 = pageFctory.createLink ( "Yahho", "http://www.yahoo.com" );
        Link link4 = pageFctory.createLink ( "Yahho!Japan", "http://www.yahoo.co.jp" );

        Tray trayNews = pageFctory.createTray ( "新闻" );
        trayNews.add ( link1 );
        trayNews.add ( link2 );

        Tray trayYahoo = pageFctory.createTray ( "雅虎" );
        trayYahoo.add ( link3 );
        trayYahoo.add ( link4 );

        Page listPage = pageFctory.createPage ( "列表网页", "王春辉" );
        listPage.add ( trayNews );
        listPage.add ( trayYahoo );

        listPage.outPut ();

    }

}
