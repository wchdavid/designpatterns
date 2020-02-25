package com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory;

/**
 * @Author wangchunhui
 * @Description //银联支付
 * @Date 19:47 2020/2/25
 **/
public class Unionpay implements IPayMethod {

    protected Unionpay() {
    }

    @Override
    public void pay(Double amount) {
        System.out.println("银联支付金额" + amount);
    }
}
