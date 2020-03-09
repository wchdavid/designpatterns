package com.gupao.vip.designpatterns.decorator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:41 2020/3/10
 **/
public class GrowthWallNav extends AbsNavDecorator {
    public GrowthWallNav(INav iNav) {
        super(iNav);
    }

    @Override
    public String showNavs() {
        return iNav.showNavs()+"--成长墙";
    }
}
