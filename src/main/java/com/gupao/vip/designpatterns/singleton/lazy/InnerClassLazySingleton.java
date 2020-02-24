package com.gupao.vip.designpatterns.singleton.lazy;

/**
 * @Author wangchunhui
 * @Description //内部类懒汉式
 * 既可以避免饿汉式的内存浪费，也可以规避synchronized的性能问题
 * @Date 11:25 2019/10/23
 **/
public class InnerClassLazySingleton {

    private InnerClassLazySingleton() {
        if (LazyHolder.LAZY_SINGLETON != null) {
           throw new RuntimeException("不能创建多个实例");
        }
    }

    private static InnerClassLazySingleton getInstance() {
        return LazyHolder.LAZY_SINGLETON;
    }

    static class LazyHolder {

        private static final InnerClassLazySingleton LAZY_SINGLETON = new InnerClassLazySingleton();

    }


}
