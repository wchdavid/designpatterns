package com.gupao.vip.designpatterns.prototype;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:08 2019/7/7
 **/
public class PrototypeTest {

    public static void main(String[] args) {
        Manager manager = new Manager ();
        AbsProduct product1 = new UnderlinedPen ( "~" );
        AbsProduct product2 = new MessageBox ( "*" );
        AbsProduct product3 = new MessageBox ( "/" );

        manager.registerProduct ( "a", product1 );
        manager.registerProduct ( "b", product2 );
        manager.registerProduct ( "c", product3 );

        AbsProduct product4 = manager.create ( "a" );
        product4.use ( "Hello Word" );
        AbsProduct product5 = manager.create ( "b" );
        product5.use ( "Hello Word" );
        AbsProduct product6 = manager.create ( "c" );
        product6.use ( "Hello Word" );
    }


}
