package com.gupao.vip.designpatterns.factory.simplefactory;

/**
 * @Author wangchunhui
 * @Description //简单工厂测试
 * @Date 23:32 2019/7/1
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {
        JavaCourse javaCourse = CourseFactory.create ( "com.gupao.vip.designpatterns.factory.simplefactory.JavaCourse" );
        System.out.println (javaCourse.getContent ());
        AbsCourse pythonCourse = CourseFactory.create ( PythonCourse.class );
        System.out.println (pythonCourse.getContent());
    }


}
