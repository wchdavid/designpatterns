package com.gupao.vip.designpatterns.Interpreter;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:19 2020/3/25
 **/
public class AddInterpreter extends AbsArithmeticInterpreter {

    public AddInterpreter(IArithmeticInterpreter leftInterpreter, IArithmeticInterpreter rightInterpreter) {
        super(leftInterpreter, rightInterpreter);
    }

    @Override
    public int interpreter() {
        return leftInterpreter.interpreter() + rightInterpreter.interpreter();
    }

}
