package com.gupao.vip.designpatterns.memento.exercise;

import java.util.Stack;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:18 2020/3/26
 **/
public class DraftBox {

    private static final Stack<ArticalMemento> STACK = new Stack<>();

    public void storeArticalMemento(ArticalMemento memento){
        STACK.push(memento);
    }

    public ArticalMemento getArticalMemento( ){
        return STACK.pop();
    }
}
