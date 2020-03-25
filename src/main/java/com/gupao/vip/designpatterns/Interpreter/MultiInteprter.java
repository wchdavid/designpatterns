package com.gupao.vip.designpatterns.Interpreter;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:21 2020/3/25
 **/
public class MultiInteprter extends AbsArithmeticInterpreter {
    public MultiInteprter(IArithmeticInterpreter leftInterpreter, IArithmeticInterpreter rightInterpreter) {
        super(leftInterpreter, rightInterpreter);
    }

    @Override
    public int interpreter() {
        return leftInterpreter.interpreter() * rightInterpreter.interpreter();
    }
}
