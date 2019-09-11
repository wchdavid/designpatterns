package com.gupao.vip.designpatterns.adapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author wangchunhui
 * @Description //适配器模式
 * @Date 23:55 2019/7/4
 **/
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String filepath) throws IOException {
        FileInputStream in = new FileInputStream(filepath);
        load(in);
    }

    @Override
    public void writeToFile(String filepath) throws IOException {
        FileOutputStream out = new FileOutputStream(filepath);
        store(out, "test");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return String.valueOf(get(key));

    }

    public static void main(String[] args) {

    }

}
