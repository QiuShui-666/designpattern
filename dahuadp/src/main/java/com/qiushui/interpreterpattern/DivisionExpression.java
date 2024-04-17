package com.qiushui.interpreterpattern;

// 非终结符表达式 - 除法
public class DivisionExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        int rightValue = right.interpret(context);
        if (rightValue != 0) {
            return left.interpret(context) / rightValue;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }
}
