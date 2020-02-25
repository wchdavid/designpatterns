package com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory.test;

import com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory.*;

/**
 * @Author wangchunhui
 * @Date 20:07 2020/2/25
 **/
public class payMethodFactoryTest {

    public static void main(String[] args) {
        IPayMethodFactory unionpayFactory = new UnionpayFactory();
        IPayMethod unionpay = unionpayFactory.createPayMethod();
        unionpay.pay(10000d);

        IPayMethodFactory alipayFactory = new AlipayFactory();
        IPayMethod alipay = alipayFactory.createPayMethod();
        alipay.pay(90000d);

        IPayMethodFactory weChatPayFactory = new WeChatPayFactory();
        IPayMethod weiChatpay = weChatPayFactory.createPayMethod();
        weiChatpay.pay(80000d);
    }
}
