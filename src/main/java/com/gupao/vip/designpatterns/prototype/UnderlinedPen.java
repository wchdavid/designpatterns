package com.gupao.vip.designpatterns.prototype;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:53 2019/7/7
 **/
public class UnderlinedPen extends AbsProduct {

    private String decorator;

    public UnderlinedPen(String decorator) {
        this.decorator = decorator;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println(s);

        for (int i = 0; i < length; i++) {
            System.out.print(decorator);
        }

        System.out.println("");
    }
}
