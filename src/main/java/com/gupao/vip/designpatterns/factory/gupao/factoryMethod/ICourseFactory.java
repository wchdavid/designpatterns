package com.gupao.vip.designpatterns.factory.gupao.factoryMethod;

import com.gupao.vip.designpatterns.factory.gupao.ICourse;

/**
 * @Author wangchunhui
 * @Date 22:48 2019/10/22
 **/
public interface ICourseFactory {

    public ICourse create(Class<? extends ICourse> clazz);
}
