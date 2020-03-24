package com.gupao.vip.designpatterns.observer.general.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:28 2020/3/24
 **/
public class CustometStaff<E extends AbsMessage> implements ICustomerService<E> {

    private List<ICustomer<E>> customers = new ArrayList<>();

    @Override
    public void addCustomer(ICustomer<E> customer) {
        customers.add(customer);
    }

    @Override
    public void delCustomer(ICustomer<E> customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyCustomers(E e) {
        System.out.println("=======================");
        System.out.println("普通职员发出通知：");
        for (ICustomer<E> customer : customers) {
            if(e instanceof ShortMessage){
                System.out.println("以短信形式发送");
                customer.receiveMessage(e);
            }else if(e instanceof MailMessage){
                System.out.println("以邮件形式发送");
                customer.receiveMessage(e);
            }
        }
    }
}
