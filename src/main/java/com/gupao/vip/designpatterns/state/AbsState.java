package com.gupao.vip.designpatterns.state;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 21:04 2020/3/27
 **/
public abstract class AbsState {
    protected StateContext context;

    protected abstract void swtchState(User user);

    protected abstract void comment();

    protected abstract void collect();

    protected abstract void marketing();

}
