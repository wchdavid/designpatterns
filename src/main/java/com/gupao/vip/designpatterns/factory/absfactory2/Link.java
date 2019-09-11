package com.gupao.vip.designpatterns.factory.absfactory2;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 11:34 2019/7/20
 **/
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super ( caption );
        this.url = url;
    }
}
