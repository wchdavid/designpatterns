package com.gupao.vip.designpatterns.factory.gupao.simpleFactory;

import com.gupao.vip.designpatterns.factory.gupao.ICourse;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:28 2019/10/22
 **/
public class CourseFactory {

    public static ICourse create(Class<? extends ICourse> clazz) {
        ICourse course = null;
        if (clazz == null) {
            return course;
        }

        try {
            course = clazz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return course;
    }

}
