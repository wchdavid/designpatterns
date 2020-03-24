package com.gupao.vip.designpatterns.observer.guava.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GPer {
    private String name = "GPer生态圈";
    private static final GPer gper = new GPer();
    private final ExecutorService threadPool = Executors.newFixedThreadPool(3);

    private GPer() {}

    public static GPer getInstance(){
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        threadPool.execute(new SendQuestion(question));
    }

    class SendQuestion extends Thread{
        private Question question;

        public SendQuestion(Question question){
            this.question = question;
        }

        @Override
        public void run() {
            try {
                QuestionQueue.getInstance().put(question);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
