package com.gupao.vip.designpatterns.factory.simplefactory;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author wangchunhui
 * @Description //简单工厂
 * @Date 23:18 2019/7/1
 **/
public class CourseFactory {

    public static JavaCourse create(String courseClassName) {
        if (!StringUtils.isBlank(courseClassName)) {
            try {
                return (JavaCourse) Class.forName(courseClassName).newInstance();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static AbsCourse create(Class<? extends AbsCourse> clazz) {
        if (clazz == null) {
            return null;
        }

        AbsCourse course = null;
        try {
            course = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return course;
    }
}
