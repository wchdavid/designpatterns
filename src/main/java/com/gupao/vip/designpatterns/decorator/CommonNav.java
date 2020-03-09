package com.gupao.vip.designpatterns.decorator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:10 2020/3/10
 **/
public class CommonNav implements INav {

    @Override
    public String showNavs() {
        return "问答--文章--精品课--冒泡--商城";
    }

}
