package com.gupao.vip.designpatterns.prototype;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:42 2019/7/7
 **/
public class MessageBox extends AbsProduct {
    private String decorator;

    public MessageBox(String decorator) {
        this.decorator = decorator;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decorator);
        }
        System.out.println("");
        System.out.println(decorator + " " + s + " " + decorator);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decorator);
        }
        System.out.println("");
    }

}
