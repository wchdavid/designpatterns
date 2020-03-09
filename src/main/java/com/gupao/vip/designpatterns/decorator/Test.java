package com.gupao.vip.designpatterns.decorator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:27 2020/3/10
 **/
public class Test {

    public static void main(String[] args) {

        INav baseNav = new CommonNav();
        System.out.println(baseNav.showNavs());

        INav qNav = new QuestionNav(baseNav);
        System.out.println(qNav.showNavs());

        INav tNav = new TaskNav(qNav);
        System.out.println(tNav.showNavs());

    }
}
