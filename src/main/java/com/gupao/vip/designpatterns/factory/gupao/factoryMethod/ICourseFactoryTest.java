package com.gupao.vip.designpatterns.factory.gupao.factoryMethod;


import com.gupao.vip.designpatterns.factory.gupao.ICourse;
import com.gupao.vip.designpatterns.factory.gupao.JavaCourse;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:55 2019/10/22
 **/
public class ICourseFactoryTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse javaCourse = factory.create(JavaCourse.class);
        javaCourse.record();
    }


}
