package com.gupao.vip.designpatterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 8:56 2020/3/24
 **/
public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        CustomerService service = (CustomerService)o;
        String msg = (String)arg;

        System.out.println("客户"+this.name+"接收到一条信息："+msg);

    }
}
