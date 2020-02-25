package com.gupao.vip.designpatterns.factory.factorymethod.payMethodFactory;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 20:01 2020/2/25
 **/
public class WeChatPayFactory implements IPayMethodFactory {
    @Override
    public IPayMethod createPayMethod() {
        return new WeChatPay();
    }
}
