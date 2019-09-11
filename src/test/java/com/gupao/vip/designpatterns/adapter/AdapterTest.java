package com.gupao.vip.designpatterns.adapter;

import java.io.IOException;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 0:09 2019/7/5
 **/
public class AdapterTest {

    public static void main(String[] args) {
        FileIO f = new FileProperties ();
        try {
            f.readFromFile ( "E:\\file.txt" );
            f.setValue ( "year","2019" );
            f.setValue ( "month","07" );
            f.writeToFile ( "E:\\newfile.txt" );
        } catch ( IOException e ) {
            e.printStackTrace ();
        }


    }
}
