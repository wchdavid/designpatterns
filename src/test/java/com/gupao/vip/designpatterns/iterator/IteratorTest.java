package com.gupao.vip.designpatterns.iterator;

import java.util.Iterator;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:12 2019/7/4
 **/
public class IteratorTest {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf (3);
        bookShelf.getBookList ().add ( "Java" );
        bookShelf.getBookList ().add ( "Python" );
        bookShelf.getBookList ().add ( "C++" );
        bookShelf.getBookList ().add ( "go" );

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext ()){
            System.out.println (iterator.next ());
        }


    }
}
