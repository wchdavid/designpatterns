package com.gupao.vip.designpatterns.Interpreter;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:15 2020/3/25
 **/
public abstract class AbsArithmeticInterpreter implements IArithmeticInterpreter{

    protected IArithmeticInterpreter leftInterpreter;
    protected IArithmeticInterpreter rightInterpreter;

    public AbsArithmeticInterpreter(IArithmeticInterpreter leftInterpreter, IArithmeticInterpreter rightInterpreter) {
        this.leftInterpreter = leftInterpreter;
        this.rightInterpreter = rightInterpreter;
    }
}
