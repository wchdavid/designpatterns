package com.gupao.vip.designpatterns.singleton.hungry;

/**
 * @Author wangchunhui
 * @Date 10:33 2019/10/23
 **/

public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
        if (hungryStaticSingleton != null) {
            throw new RuntimeException("不能创建多个实例");
        }
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }

}
