package com.gupao.vip.designpatterns.factory.gupao.abstractFactory;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:29 2019/10/22
 **/
public class JavaCoursefactory implements IAbsCourseFactory {
    @Override
    public INote createNote(Class<? extends INote> clazz) {
        INote note = null;
        if (clazz == null) {
            return note;
        }

        try {
            note = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return note;
    }

    @Override
    public IVedio createVedio(Class<? extends IVedio> clazz) {
        IVedio vedio = null;
        if (clazz == null) {
            return vedio;
        }

        try {
            vedio = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return vedio;
    }

}
