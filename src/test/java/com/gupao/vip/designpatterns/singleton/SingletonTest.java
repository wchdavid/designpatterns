package com.gupao.vip.designpatterns.singleton;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:26 2019/7/7
 **/
public class SingletonTest {

    public static void main(String[] args) {
        User user1 = User.getInstance ();
        User user2 = User.getInstance ();
        if (user1 == user2) {
            System.out.println ( "user1和user2是同一个对象" );
        }else {
            System.out.println ( "user1和user2不是同一个对象" );
        }

    }

}
