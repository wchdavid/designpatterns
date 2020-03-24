package com.gupao.vip.designpatterns.observer.jdk;

import java.util.Observable;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 8:52 2020/3/24
 **/
public class CustomerService extends Observable {

    private String name;

    public CustomerService(String name) {
        this.name = name;
    }

    public void publishMessage(String msg){
        System.out.println("客服"+this.name+"发出通知");
        setChanged();
        notifyObservers(msg);
    }
}
