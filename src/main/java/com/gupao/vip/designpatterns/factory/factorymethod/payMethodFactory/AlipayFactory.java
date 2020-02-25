package com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory;

/**
 * @Author wangchunhui
 * @Date 19:59 2020/2/25
 **/
public class AlipayFactory implements IPayMethodFactory{
    @Override
    public IPayMethod createPayMethod() {
        return new Alipay();
    }
}
