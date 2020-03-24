package com.gupao.vip.designpatterns.observer.general;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 7:02 2020/3/24
 **/
public class Test {

    public static void main(String[] args) {
        ISubject<String> subject = new ConcreteSubject<>();
        IObserver<String> observer = new ConcreteObserver<>();

        subject.addObserver(observer);
        subject.notify("Hello");

    }

}
