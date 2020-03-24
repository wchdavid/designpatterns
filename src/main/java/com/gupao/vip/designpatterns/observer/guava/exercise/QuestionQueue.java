package com.gupao.vip.designpatterns.observer.guava.exercise;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Author wangchunhui
 * @Description //问题队列
 * @Date 10:04 2020/3/24
 **/
public class QuestionQueue {
    private static QuestionQueue questionQueue= null;
    private static final BlockingQueue<Question> qQueue = new LinkedBlockingDeque<>();

    private QuestionQueue() {
    }

    public static QuestionQueue getInstance(){
       if(questionQueue == null){
            synchronized (QuestionQueue.class){
               if(questionQueue == null){
                   questionQueue = new QuestionQueue();
               }
            }
       }
        return questionQueue;
    }

    public void put(Question o) throws InterruptedException{
        qQueue.put(o);
    }

    public Question take() throws InterruptedException{
        return qQueue.take();
    }

    public boolean isEmpty(){
        return qQueue.isEmpty();
    }

    public int getQueueSize(){
        return qQueue.size();
    }

    public void wakeup(){
        this.qQueue.notifyAll();
    }

}
