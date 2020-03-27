package com.gupao.vip.designpatterns.state;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:12 2020/3/27
 **/
public class LoginState extends AbsState {
    @Override
    protected void swtchState(User user) {
         if(user.getState() ==0){
             context.changeState(new UnloginSate());
         }
    }

    @Override
    protected void comment() {
        System.out.println("评论");
    }

    @Override
    protected void collect() {
        System.out.println("收藏");
    }

    @Override
    protected void marketing() {
        System.out.println("打分");
    }
}
