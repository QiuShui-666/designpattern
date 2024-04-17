package com.qiushui.interpreterpattern;

// 非终结符表达式 - 变量引用
public class VariableExpression implements Expression {
    private final String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public int interpret(Context context) {
        return context.getVariableValue(variableName);
    }
}
