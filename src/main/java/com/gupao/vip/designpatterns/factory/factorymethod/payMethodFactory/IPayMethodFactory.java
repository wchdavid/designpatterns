package com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory;

/**
 * @Author wangchunhui
 * @Description //支付方式工厂
 * @Date 19:53 2020/2/25
 **/
public interface IPayMethodFactory {

    IPayMethod createPayMethod();

}
