package com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory;

/**
 * @Author wangchunhui
 * @Description //支付宝
 * @Date 19:47 2020/2/25
 **/
public class Alipay implements IPayMethod {

    protected Alipay() {
    }

    @Override
    public void pay(Double amount) {
        System.out.println("支付宝支付金额" + amount);
    }
}
