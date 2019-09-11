package com.gupao.vip.designpatterns.factory.absfactory2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 11:37 2019/7/20
 **/
public abstract class Tray extends Item{

    protected List<Item> tray = new ArrayList <> (  );

    public Tray(String caption) {
        super ( caption );
    }

    protected void add(Item item){
        tray.add ( item );
    }

}
