package com.gupao.vip.designpatterns.memento.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:13 2020/3/26
 **/
public class ArticalMemento {

    private String title;
    private String content;

    public ArticalMemento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
