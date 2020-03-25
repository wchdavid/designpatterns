package com.gupao.vip.designpatterns.Interpreter;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 10:26 2020/3/25
 **/
public class ElCalculator {
    private static ElCalculator elCalculator = null;

    private Stack<IArithmeticInterpreter> numStack = new Stack<>();
    private Stack<String> operaterStack = new Stack<>();

    private ElCalculator() {
    }

    public static synchronized ElCalculator getInstance() {
        if (elCalculator == null) {
            elCalculator = new ElCalculator();
        }
        return elCalculator;
    }

    public int execute(String expression) {
        String stdExpression = convertToStdExpression(expression);
        System.out.println("标准表达式：" + stdExpression);
        String[] elements = stdExpression.split(" ");

        for (String s : elements) {
            if (StringUtils.isBlank(s)) {
                continue;
            }

            if (isFistLevelOperStart(s)) {
                operaterStack.push(s);
                System.out.println("括号计算开始,操作符:" + s + "入栈");
            } else if (isFistLevelOperEnd(s)) {
                while (!isFistLevelOperStart(operaterStack.peek())) {
                    numStack.push(getInterpreter(numStack, operaterStack));
                }
                operaterStack.pop();
                System.out.println("括号计算完毕，清除左括号");
            } else if (isSecondLevelOper(s)) {
                System.out.println("到右括号");
                while (!operaterStack.isEmpty() && isSecondLevelOper(operaterStack.peek())) {
                    numStack.push(getInterpreter(numStack, operaterStack));
                }
                operaterStack.push(s);
                System.out.println("操作符:" + s + "入栈");
            } else if (isLastLevelOper(s)) {
                while (!operaterStack.isEmpty() && isSimpleOper(operaterStack.peek())) {
                    numStack.push(getInterpreter(numStack, operaterStack));
                }
                operaterStack.push(s);
                System.out.println("操作符:" + s + "入栈");
            } else {
                numStack.push(new NumberInterpreter(Integer.valueOf(s)));
                System.out.println("数字:" + s + "入栈");
            }
        }

        while (!operaterStack.isEmpty()) {
            numStack.push(getInterpreter(numStack, operaterStack));
        }
        return numStack.pop().interpreter();
    }

    private IArithmeticInterpreter getInterpreter(Stack<IArithmeticInterpreter> numStack, Stack<String> operaterStack) {
        IArithmeticInterpreter rightNum = numStack.pop();
        IArithmeticInterpreter leftNum = numStack.pop();
        String symbol = operaterStack.pop();
        System.out.println("表达式" + leftNum.interpreter() + " " + symbol + " " + rightNum.interpreter() + "入栈");
        if ("+".equals(symbol)) {
            return new AddInterpreter(leftNum, rightNum);
        } else if ("-".equals(symbol)) {
            return new SubInterpreter(leftNum, rightNum);
        } else if ("*".equals(symbol)) {
            return new MultiInteprter(leftNum, rightNum);
        } else if ("/".equals(symbol)) {
            return new DivIntepreter(leftNum, rightNum);
        } else {
            return new NumberInterpreter(0);
        }
    }

    private String convertToStdExpression(String expression) {
        String stdExpression = "";
        if (StringUtils.isBlank(expression)) {
            return stdExpression;
        }

        for (int i = 0; i < expression.length(); i++) {
            if (this.isOperator(expression.charAt(i))) {
                stdExpression += " " + expression.charAt(i) + " ";
            } else {
                stdExpression += expression.charAt(i);
            }
        }
        return stdExpression;
    }

    private boolean isOperator(char symbol) {
        return (symbol == '+' || symbol == '-' || symbol == '*'
                || symbol == '/' || symbol == '(' || symbol == ')');
    }

    private boolean isFistLevelOperStart(String symbol) {
        return symbol.equals("(");
    }

    private boolean isFistLevelOperEnd(String symbol) {
        return symbol.equals(")");
    }

    private boolean isSecondLevelOper(String symbol) {
        return symbol.equals("*") || symbol.equals("/");
    }

    private boolean isLastLevelOper(String symbol) {
        return symbol.equals("+") || symbol.equals("-");
    }

    private boolean isSimpleOper(String symbol) {
        return symbol.equals("+") || symbol.equals("-")
                || symbol.equals("*") || symbol.equals("/");
    }

}
