package com.gupao.vip.designpatterns.Interpreter;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 11:09 2020/3/25
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println(ElCalculator.getInstance().execute("100 * (3 + 5 + (4 + 400) * 2) + 66"));
    }
}
