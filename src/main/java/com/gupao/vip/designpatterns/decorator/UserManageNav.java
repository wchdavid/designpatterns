package com.gupao.vip.designpatterns.decorator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:40 2020/3/10
 **/
public class UserManageNav extends AbsNavDecorator {
    public UserManageNav(INav iNav) {
        super(iNav);
    }

    @Override
    public String showNavs() {
        return iNav.showNavs()+"--用户管理";
    }
}
