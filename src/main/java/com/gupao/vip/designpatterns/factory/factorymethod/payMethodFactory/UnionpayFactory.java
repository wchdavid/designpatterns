package com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory;

/**
 * @Author wangchunhui
 * @Date 19:55 2020/2/25
 **/
public class UnionpayFactory implements IPayMethodFactory{

    @Override
    public IPayMethod createPayMethod() {
        return new Unionpay();
    }
}
