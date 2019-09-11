package com.gupao.vip.designpatterns.builder;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 4:19 2019/7/20
 **/
public interface Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();


}
