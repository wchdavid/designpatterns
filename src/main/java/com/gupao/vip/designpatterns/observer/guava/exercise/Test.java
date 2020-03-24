package com.gupao.vip.designpatterns.observer.guava.exercise;

import com.google.common.eventbus.EventBus;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:40 2020/3/24
 **/
public class Test {

    public static void main(String[] args) {

        Question question1 = new Question("小明","创建型设计模式有哪几种？");
        Question question2 = new Question("小花","结构型设计模式有哪几种？");
        Question question3 = new Question("小小","行为型设计模式有哪几种？");
        Question question4 = new Question("小雷","如何学好设计模式？");

        GPer.getInstance().publishQuestion(question1);
        GPer.getInstance().publishQuestion(question2);
        GPer.getInstance().publishQuestion(question3);
        GPer.getInstance().publishQuestion(question4);

        EventBus eventBus = new EventBus();
        Teacher teacher = new Teacher("Tom");
        eventBus.register(teacher);
        eventBus.post(QuestionQueue.getInstance());
    }

}
