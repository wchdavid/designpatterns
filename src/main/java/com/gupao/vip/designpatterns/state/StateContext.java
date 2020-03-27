package com.gupao.vip.designpatterns.state;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:09 2020/3/27
 **/
public class StateContext {

    private AbsState currentSate = new UnloginSate();

    protected void changeState(AbsState state) {
        this.currentSate = state;
    }

    public void setState(User user) {
        this.currentSate.context = this;
        this.currentSate.swtchState(user);
    }

    public void comment() {
        this.currentSate.comment();
    }

    public void collect() {
        this.currentSate.collect();
    }

    public void marketing() {
        this.currentSate.marketing();
    }

}
