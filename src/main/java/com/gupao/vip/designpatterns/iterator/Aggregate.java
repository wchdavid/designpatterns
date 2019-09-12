package com.gupao.vip.designpatterns.iterator;

import java.util.Iterator;

/**
 * @Author wangchunhui
 * @Description //迭代器设计模式
 * @Date 20:48 2019/7/4
 **/
public interface Aggregate<T> {
    public Iterator<T> iterator();
}
