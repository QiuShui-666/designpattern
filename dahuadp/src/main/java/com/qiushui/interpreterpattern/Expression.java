package com.qiushui.interpreterpattern;

// 抽象表达式
public interface Expression {
    int interpret(Context context);
}
