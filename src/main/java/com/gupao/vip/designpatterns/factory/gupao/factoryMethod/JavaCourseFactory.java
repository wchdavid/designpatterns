package com.gupao.vip.designpatterns.factory.gupao.factoryMethod;

import com.gupao.vip.designpatterns.factory.gupao.ICourse;
import com.gupao.vip.designpatterns.factory.gupao.JavaCourse;

/**
 * @Author wangchunhui
 * @Date 22:51 2019/10/22
 **/
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create(Class<? extends ICourse> clazz) {
        JavaCourse course = null;
        if(clazz == null){
            return course;
        }

        try {
            course = (JavaCourse)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return course;
    }
}
