package com.gupao.vip.designpatterns.observer.general.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:14 2020/3/24
 **/
public abstract class AbsMessage {

    protected String title;
    protected String context;

    public AbsMessage(String title, String context) {
        this.title = title;
        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
