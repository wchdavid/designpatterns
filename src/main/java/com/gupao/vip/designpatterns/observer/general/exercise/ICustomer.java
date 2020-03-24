package com.gupao.vip.designpatterns.observer.general.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:31 2020/3/24
 **/
public interface ICustomer<E> {

      void receiveMessage(E e);
}
