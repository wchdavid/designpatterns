package com.gupao.vip.designpatterns.factory.gupao.abstractFactory;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:32 2019/10/22
 **/
public class IAbsCourseFactoryTest {

    public static void main(String[] args) {
        IAbsCourseFactory javaCourseFactory = new JavaCoursefactory();
        INote javaNote = javaCourseFactory.createNote(JavaNote.class);
        javaNote.note();
    }
}
