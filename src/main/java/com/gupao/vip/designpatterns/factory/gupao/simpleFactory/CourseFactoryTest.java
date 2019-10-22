package com.gupao.vip.designpatterns.factory.gupao.simpleFactory;

import com.gupao.vip.designpatterns.factory.gupao.ICourse;
import com.gupao.vip.designpatterns.factory.gupao.JavaCourse;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:32 2019/10/22
 **/
public class CourseFactoryTest {

    public static void main(String[] args) {
        ICourse course = CourseFactory.create(JavaCourse.class);
        course.record();
    }

}
