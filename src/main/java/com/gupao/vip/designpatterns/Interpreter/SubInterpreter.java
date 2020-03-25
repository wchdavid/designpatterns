package com.gupao.vip.designpatterns.Interpreter;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:20 2020/3/25
 **/
public class SubInterpreter extends AbsArithmeticInterpreter{

    public SubInterpreter(IArithmeticInterpreter leftInterpreter, IArithmeticInterpreter rightInterpreter) {
        super(leftInterpreter, rightInterpreter);
    }

    @Override
    public int interpreter() {
        return leftInterpreter.interpreter() - rightInterpreter.interpreter();
    }
}
