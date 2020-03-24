package com.gupao.vip.designpatterns.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 9:26 2020/3/24
 **/
public class Test {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus();

        IEnentHandler enentHandler1 = new EventHandlerImpl();
        IEnentHandler enentHandler2 = new EventHandlerImpl();

        eventBus.register(enentHandler1);
        eventBus.register(enentHandler2);

        eventBus.post(new VoEvent());
    }

}
