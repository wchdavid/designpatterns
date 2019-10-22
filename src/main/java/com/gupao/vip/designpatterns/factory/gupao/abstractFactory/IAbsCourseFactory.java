package com.gupao.vip.designpatterns.factory.gupao.abstractFactory;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:18 2019/10/22
 **/
public interface IAbsCourseFactory {

    INote createNote(Class<? extends INote> clazz);

    IVedio createVedio(Class<? extends IVedio> clazz);
}
