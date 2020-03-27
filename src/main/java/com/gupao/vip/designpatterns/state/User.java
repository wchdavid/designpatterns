package com.gupao.vip.designpatterns.state;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:14 2020/3/27
 **/
public class User {

    private String name;
    private String sex;
    private Integer state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
