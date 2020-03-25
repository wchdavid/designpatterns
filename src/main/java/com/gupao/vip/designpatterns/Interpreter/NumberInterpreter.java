package com.gupao.vip.designpatterns.Interpreter;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:17 2020/3/25
 **/
public class NumberInterpreter implements IArithmeticInterpreter {
    private Integer value;

    public NumberInterpreter(Integer value) {
        this.value = value;
    }

    @Override
    public int interpreter() {
        return value;
    }
}
