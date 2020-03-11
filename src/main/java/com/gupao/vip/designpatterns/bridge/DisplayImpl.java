package com.gupao.vip.designpatterns.bridge;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 23:27 2020/3/8
 **/
public class  DisplayImpl implements IDisplay{


   @Override
   public void rawOpen() {
      System.out.println("open");
   }

   @Override
   public void rawPrint() {
      System.out.println("print");
   }

   @Override
   public void rawClose() {
      System.out.println("close");
   }
}
