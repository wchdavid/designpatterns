package com.gupao.vip.designpatterns.iterator;

import java.util.Iterator;

/**
 * @Author wangchunhui
 * @Description //迭代器设计模式
 * @Date 20:55 2019/7/4
 **/
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (bookShelf == null || bookShelf.getBookList() == null) {
            return false;
        }
        if (index <= bookShelf.getBookList().size() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Object result = bookShelf.getBookList().get(index);
        index++;
        return result;
    }

    @Override
    public void remove() {
        bookShelf.getBookList().remove(index);
    }
}
