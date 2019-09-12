package com.gupao.vip.designpatterns.adapter;

import java.io.IOException;

/**
 * @Author wangchunhui
 * @Description //适配器设计模式
 * @Date 23:52 2019/7/4
 **/
public interface FileIO {
    public void readFromFile(String filepath) throws IOException;

    public void writeToFile(String filepath) throws IOException;

    public void setValue(String key, String value);

    public String getValue(String key);

}
