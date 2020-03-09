package com.gupao.vip.designpatterns.decorator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:16 2020/3/10
 **/
public class QuestionNav extends AbsNavDecorator {

    public QuestionNav(INav iNav) {
        super(iNav);
    }

    @Override
    public String showNavs() {
        return iNav.showNavs()+"--题库";
    }
}
