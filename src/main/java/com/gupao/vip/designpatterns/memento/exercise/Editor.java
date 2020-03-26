package com.gupao.vip.designpatterns.memento.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:10 2020/3/26
 **/
public class Editor {

    private String title;
    private String content;

    public Editor(String title, String content) {
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

    public ArticalMemento createMemento(){
         return new ArticalMemento(this.title,this.content);
    }

    public void recoverFromMemento(ArticalMemento memento){
        this.title = memento.getTitle();
        this.content = memento.getContent();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
