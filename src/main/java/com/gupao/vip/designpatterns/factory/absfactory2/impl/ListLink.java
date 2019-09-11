package com.gupao.vip.designpatterns.factory.absfactory2.impl;

import com.gupao.vip.designpatterns.factory.absfactory2.Link;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 11:53 2019/7/20
 **/
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super ( caption, url );
    }

    @Override
    public String makeHtml() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
