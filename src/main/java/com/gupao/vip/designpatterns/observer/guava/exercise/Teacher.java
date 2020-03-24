package com.gupao.vip.designpatterns.observer.guava.exercise;

import com.google.common.eventbus.Subscribe;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void handleQuestion(QuestionQueue questionQueue) {
        while(questionQueue.getQueueSize()>0){
            try {
                System.out.println("======================");
                Question question = questionQueue.take();
                System.out.println(DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss ")+name + "老师，你好！\n" +
                        "您收到了一个来自沽泡圈的提问，希望您解答。问题内容如下：\n" +
                        question.getContent() + "\n" +
                        "提问者：" + question.getUserName());
                Thread.sleep(30 * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
