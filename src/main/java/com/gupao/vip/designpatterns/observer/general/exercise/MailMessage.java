package com.gupao.vip.designpatterns.observer.general.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:21 2020/3/24
 **/
public class MailMessage extends AbsMessage {

    private String sentName;
    private String receiveName;

    public MailMessage(String title, String context, String sentName, String receiveName) {
        super(title, context);
        this.sentName = sentName;
        this.receiveName = receiveName;
    }

    public String getSentName() {
        return sentName;
    }

    public void setSentName(String sentName) {
        this.sentName = sentName;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }
}
