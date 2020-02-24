package com.gupao.vip.designpatterns.singleton;

import com.gupao.vip.designpatterns.singleton.lazy.DoubleCheckLazySingleton;

/**
 * @Author wangchunhui
 * @Description // 线程操作
 * @Date 14:14 2020/1/31
 **/
public class ExcuteThread implements Runnable{
    @Override
    public void run() {
//        SimpleLazySingleton lazySingleton = SimpleLazySingleton.getInstance();

        DoubleCheckLazySingleton lazySingleton = DoubleCheckLazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
    }
}
