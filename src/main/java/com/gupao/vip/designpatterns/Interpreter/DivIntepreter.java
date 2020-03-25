package com.gupao.vip.designpatterns.Interpreter;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:22 2020/3/25
 **/
public class DivIntepreter extends AbsArithmeticInterpreter {
    public DivIntepreter(IArithmeticInterpreter leftInterpreter, IArithmeticInterpreter rightInterpreter) {
        super(leftInterpreter, rightInterpreter);
    }

    @Override
    public int interpreter() {
        return leftInterpreter.interpreter() / rightInterpreter.interpreter();
    }
}
