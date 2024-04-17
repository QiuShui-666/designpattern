package com.qiushui.interpreterpattern;

// 非终结符表达式 - 括号
public class GroupingExpression implements Expression {
    private final Expression expression;

    public GroupingExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(Context context) {
        return expression.interpret(context);
    }
}
