package com.gupao.vip.designpatterns.iterator;

import java.util.Iterator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 20:48 2019/7/4
 **/
public interface Aggregate<T> {
    public Iterator<T> iterator();
}
