package com.gupao.vip.designpatterns.observer.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:00 2020/3/24
 **/
public class ConcreteSubject<E> implements ISubject<E> {

    private List<IObserver<E>> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver<E> observer) {
        observers.add(observer);
    }

    @Override
    public void delObserver(IObserver<E> observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(E e) {
        for (IObserver<E> observer : observers) {
            observer.update(e);
        }
    }
}
