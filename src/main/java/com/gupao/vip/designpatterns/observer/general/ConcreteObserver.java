package com.gupao.vip.designpatterns.observer.general;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:01 2020/3/24
 **/
public class ConcreteObserver<E> implements IObserver<E>{

    @Override
    public void update(E e) {
        System.out.println("receive event :" + e);
    }
}
