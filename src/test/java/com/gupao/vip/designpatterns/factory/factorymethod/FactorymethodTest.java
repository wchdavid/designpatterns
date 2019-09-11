package com.gupao.vip.designpatterns.factory.factorymethod;

import com.gupao.vip.designpatterns.factory.simplefactory.JavaCourse;

/**
 * @Author wangchunhui
 * @Description //工厂方法测试
 * @Date 0:08 2019/7/2
 **/
public class FactorymethodTest {

    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaCourseFactory ();
        JavaCourse javaCourse = (JavaCourse) iCourseFactory.create ();
        System.out.println ( javaCourse.getContent () );
    }
}
