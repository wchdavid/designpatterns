package com.gupao.vip.designpatterns.bridge;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 20:27 2020/3/11
 **/
public class CountDisplay extends BaseDisplay {

    private int count;

    public CountDisplay(IDisplay iDisplay, int count) {
        super(iDisplay);
        this.count = count;
    }

    @Override
    protected void disPlay() {
        this.iDisplay.rawOpen();
        for (int i = 0; i < count; i++) {
            this.iDisplay.rawPrint();
        }
        this.iDisplay.rawClose();
    }
}
