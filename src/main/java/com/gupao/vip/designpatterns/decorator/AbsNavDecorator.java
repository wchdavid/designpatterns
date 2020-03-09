package com.gupao.vip.designpatterns.decorator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:12 2020/3/10
 **/
public abstract class AbsNavDecorator implements INav{

    protected INav iNav;

    public AbsNavDecorator(INav iNav) {
        this.iNav = iNav;
    }

}
