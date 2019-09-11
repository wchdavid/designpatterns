package com.gupao.vip.designpatterns.singleton;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:23 2019/7/7
 **/
public class User {
    private static User user = new User();
    private String name;
    private Integer age;

    private User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private User() {
        System.out.println("创建一个User对象");
    }

    public static User getInstance() {
        return user;
    }

}
