package com.gupao.vip.designpatterns.bridge;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 20:23 2020/3/11
 **/
public abstract class AbsDisplay {

    protected IDisplay iDisplay;

    public AbsDisplay(IDisplay iDisplay) {
        this.iDisplay = iDisplay;
    }

    protected abstract void disPlay();

}
