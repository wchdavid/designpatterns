package com.gupao.vip.designpatterns.decorator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:24 2020/3/10
 **/
public class TaskNav extends AbsNavDecorator {

    public TaskNav(INav iNav) {
        super(iNav);
    }

    @Override
    public String showNavs() {
        return iNav.showNavs()+"--作业";
    }
}
