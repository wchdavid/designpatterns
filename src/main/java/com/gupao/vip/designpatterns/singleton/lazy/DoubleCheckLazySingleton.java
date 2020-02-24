package com.gupao.vip.designpatterns.singleton.lazy;

/**
 * @Author wangchunhui
 * @Description 两次检查懒汉式单例
 * 相对于简单懒汉式在方法上枷锁
 * 给对象本身加锁，锁的粒度减小，降低了死锁的可能性
 * @Date 11:14 2019/10/23
 **/
public class DoubleCheckLazySingleton {

    private static DoubleCheckLazySingleton lazySingleton = null;

    private DoubleCheckLazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("不能创建多个实例");
        }
    }

    public static DoubleCheckLazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
