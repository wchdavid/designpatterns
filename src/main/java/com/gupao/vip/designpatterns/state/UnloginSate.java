package com.gupao.vip.designpatterns.state;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:18 2020/3/27
 **/
public class UnloginSate extends AbsState {

    @Override
    protected void swtchState(User user) {
         if(user.getState() == 1){
             context.changeState(new LoginState());
         }
    }

    @Override
    protected void comment() {
        login();
        context.comment();
    }

    @Override
    protected void collect() {
        login();
        context.comment();
    }

    @Override
    protected void marketing() {
        login();
        context.comment();
    }

    protected void login(){
        System.out.println("登陆");
        context.changeState(new LoginState());
    }

}
