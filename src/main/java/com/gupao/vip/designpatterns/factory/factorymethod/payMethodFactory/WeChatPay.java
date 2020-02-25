package com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory;

/**
 * @Author wangchunhui
 * @Description //微信支付
 * @Date 19:52 2020/2/25
 **/
public class WeChatPay implements IPayMethod{

    protected WeChatPay() {
    }

    @Override
    public void pay(Double amount) {
        System.out.println("微信支付金额" + amount);
    }
}
