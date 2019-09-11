package com.gupao.vip.designpatterns.factory.absfactory2;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 11:04 2019/7/20
 **/
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();
}
