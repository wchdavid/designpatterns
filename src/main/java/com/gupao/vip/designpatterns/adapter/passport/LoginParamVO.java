package com.gupao.vip.designpatterns.adapter.passport;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:07 2020/3/9
 **/
public class LoginParamVO {

    private String openId;
    private String username;
    private String password;
    private String phone;
    private String code;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
