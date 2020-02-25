package com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory;

/**
 * @Author wangchunhui
 * @Description //支付方式抽象
 * @Date 19:43 2020/2/25
 **/
public interface  IPayMethod {

     void pay(Double amount);
}
