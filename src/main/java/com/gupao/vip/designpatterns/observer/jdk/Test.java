package com.gupao.vip.designpatterns.observer.jdk;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 9:02 2020/3/24
 **/
public class Test {

    public static void main(String[] args) {

        CustomerService service = new CustomerService("张三");
        Customer customer = new Customer("李四");

        service.addObserver(customer);
        service.publishMessage("业务推荐");

    }

}
