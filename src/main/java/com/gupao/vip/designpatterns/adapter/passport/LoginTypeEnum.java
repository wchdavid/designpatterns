package com.gupao.vip.designpatterns.adapter.passport;

/**
 * @Author wangchunhui
 * @Description //登陆方式枚举
 * @Date 10:11 2020/3/9
 **/
public enum LoginTypeEnum {

    QQ("QQ","QQ登陆"),
    WECHAT("Wechat","微信登陆"),
    TEL("Tel","电话登陆"),
    TOKEN("Token","Token登陆"),

    ;

    LoginTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}