package com.gupao.vip.designpatterns.factory.absfactory1;

/**
 * @Author wangchunhui
 * @Description //抽象工厂测试
 * @Date 10:04 2019/7/2
 **/
public class AbsFactoryTest {

    public static void main(String[] args) {
        ICourseFactory javaFactory = new JavaCourseFactory ();
        javaFactory.createNote ().note ();
        javaFactory.craereVedio ().vedio ();

        ICourseFactory pythonFactory = new PythonCourseFactory ();
        pythonFactory.craereVedio ().vedio ();
        pythonFactory.createNote ().note ();
    }


}
