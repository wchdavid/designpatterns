package com.gupao.vip.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 20:52 2019/7/4
 **/
public class BookShelf implements Aggregate {
    private List<String> bookList;
    private int index = 0;

    public BookShelf(int maxSize) {
        this.bookList = new ArrayList<>(maxSize);
    }

    public void appandBook(String book) {
        bookList.set(index, book);
        index++;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public List getBookList() {
        return bookList;
    }

}
