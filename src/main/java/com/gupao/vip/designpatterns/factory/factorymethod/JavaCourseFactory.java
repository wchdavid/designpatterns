package com.gupao.vip.designpatterns.factory.factorymethod;

import com.gupao.vip.designpatterns.factory.simplefactory.AbsCourse;
import com.gupao.vip.designpatterns.factory.simplefactory.JavaCourse;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:02 2019/7/2
 **/
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public AbsCourse create() {
        return new JavaCourse ();
    }
}
