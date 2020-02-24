package com.gupao.vip.designpatterns.singleton.hungry;

/**
 * @Author wangchunhui
 * 饿汉式
 * @Date 10:30 2019/10/23
 **/
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("不能创建多个实例！");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
