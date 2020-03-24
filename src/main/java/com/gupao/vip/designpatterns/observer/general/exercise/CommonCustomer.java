package com.gupao.vip.designpatterns.observer.general.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:45 2020/3/24
 **/
public class CommonCustomer<E extends AbsMessage> implements ICustomer<E> {
    @Override
    public void receiveMessage(E e) {
        System.out.println(e.getTitle()+","+e.getContext());
    }
}
