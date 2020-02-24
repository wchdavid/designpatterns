package com.gupao.vip.designpatterns.singleton.lazy;

/**
 * @Author wangchunhui
 * @Description 简单懒汉式单例
 * @Date 11:10 2019/10/23
 **/
public class SimpleLazySingleton {

    private static SimpleLazySingleton lazySingleton = null;

    private SimpleLazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("不能创建多个实例");
        }
    }

    public static synchronized SimpleLazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new SimpleLazySingleton();
        }
        return lazySingleton;
    }

}
