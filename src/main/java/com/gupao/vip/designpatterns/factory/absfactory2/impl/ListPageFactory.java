package com.gupao.vip.designpatterns.factory.absfactory2.impl;

import com.gupao.vip.designpatterns.factory.absfactory2.Link;
import com.gupao.vip.designpatterns.factory.absfactory2.Page;
import com.gupao.vip.designpatterns.factory.absfactory2.PageFctory;
import com.gupao.vip.designpatterns.factory.absfactory2.Tray;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 11:48 2019/7/20
 **/
public class ListPageFactory extends PageFctory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink ( caption, url );
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray ( caption );
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage ( title, author );
    }
}
