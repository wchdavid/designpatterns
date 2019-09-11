package com.gupao.vip.designpatterns.factory.absfactory1;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:02 2019/7/2
 **/
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public AbsNote createNote() {
        return new PythonNote ();
    }

    @Override
    public AbsVedio craereVedio() {
        return new PythonVedio ();
    }
}
