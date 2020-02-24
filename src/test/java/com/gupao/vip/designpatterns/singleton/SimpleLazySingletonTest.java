package com.gupao.vip.designpatterns.singleton;

/**
 * @Author wangchunhui
 * @Description //懒汉式单例线程安全测试
 * @Date 14:19 2020/1/31
 **/
public class SimpleLazySingletonTest {

    public static void main(String[] args) {

        Thread th1 = new Thread(new ExcuteThread());
        Thread th2 = new Thread(new ExcuteThread());

        th1.start();
        th2.start();

        System.out.println("Excute end");
    }

}
