package com.gupao.vip.designpatterns.observer.guava;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 9:23 2020/3/24
 **/
public class EventHandlerImpl implements IEnentHandler {

    @Override
    public void handle(AbsEvent event) {
        if(event instanceof VoEvent){
            System.out.println("处理VO事件");
        }else if(event instanceof ProjoEvent){
            System.out.println("处理Projo事件");
        }

    }
}
