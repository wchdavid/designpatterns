package com.gupao.vip.designpatterns.singleton.register;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 16:30 2020/2/1
 **/
public enum EnumSingleton {

    INSTANCE;

    private Object object;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
