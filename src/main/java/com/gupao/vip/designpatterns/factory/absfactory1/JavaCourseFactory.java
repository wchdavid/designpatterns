package com.gupao.vip.designpatterns.factory.absfactory1;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 9:57 2019/7/2
 **/
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public AbsNote createNote() {
        return new JavaNote ();
    }

    @Override
    public AbsVedio craereVedio() {
        return new JavaVedio ();
    }
}
