package com.gupao.vip.designpatterns.factory.gupao;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:27 2019/10/22
 **/
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("记录Python课程");
    }
}
