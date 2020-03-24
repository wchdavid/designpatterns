package com.gupao.vip.designpatterns.observer.general;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 6:50 2020/3/24
 **/
public interface ISubject<E> {

   void addObserver(IObserver<E> observer);

   void delObserver(IObserver<E> observer);

   void notify(E e);
}
