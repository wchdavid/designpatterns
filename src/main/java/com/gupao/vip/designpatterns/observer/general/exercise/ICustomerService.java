package com.gupao.vip.designpatterns.observer.general.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:27 2020/3/24
 **/
public interface ICustomerService<E> {

    void addCustomer(ICustomer<E> customer);

    void delCustomer(ICustomer<E> customer);

    void notifyCustomers(E e);

}
