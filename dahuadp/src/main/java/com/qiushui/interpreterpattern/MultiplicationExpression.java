package com.qiushui.interpreterpattern;

// 非终结符表达式 - 乘法
public class MultiplicationExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public MultiplicationExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}

