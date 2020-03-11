package com.gupao.vip.designpatterns.bridge;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 20:32 2020/3/11
 **/
public class BaseDisplay extends AbsDisplay{

    public BaseDisplay(IDisplay iDisplay) {
        super(iDisplay);
    }

    @Override
    protected void disPlay() {

        this.iDisplay.rawOpen();

        this.iDisplay.rawPrint();

        this.iDisplay.rawClose();
    }
}
