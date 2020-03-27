package com.gupao.vip.designpatterns.state;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:57 2020/3/27
 **/
public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setState(0);

        StateContext context = new StateContext();
        context.setState(user);

        user.setState(1);
        context.setState(user);

        context.comment();
    }

}
