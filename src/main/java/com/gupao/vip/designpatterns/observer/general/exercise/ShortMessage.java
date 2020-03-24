package com.gupao.vip.designpatterns.observer.general.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:18 2020/3/24
 **/
public class ShortMessage extends AbsMessage{

    private String sentPhone;
    private String receivePhone;

    public ShortMessage(String title, String context, String sentPhone, String receivePhone) {
        super(title, context);
        this.sentPhone = sentPhone;
        this.receivePhone = receivePhone;
    }

    public String getSentPhone() {
        return sentPhone;
    }

    public void setSentPhone(String sentPhone) {
        this.sentPhone = sentPhone;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }
}
