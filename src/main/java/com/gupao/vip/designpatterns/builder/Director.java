package com.gupao.vip.designpatterns.builder;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 5:06 2019/7/20
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Getting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{
                "早上好", "下午好"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好", "晚安", "再见"
        });

        builder.close();
    }
}
