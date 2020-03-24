package com.gupao.vip.designpatterns.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 9:21 2020/3/24
 **/
public interface IEnentHandler {

    @Subscribe
    void handle(AbsEvent event);

}
