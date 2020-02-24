package com.gupao.vip.designpatterns.factory.factorymethod;

import com.gupao.vip.designpatterns.factory.simplefactory.AbsCourse;
import com.gupao.vip.designpatterns.factory.simplefactory.PythonCourse;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:07 2019/7/2
 **/
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public AbsCourse create() {
        return new PythonCourse ();
    }
}
