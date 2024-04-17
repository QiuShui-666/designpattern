package com.qiushui.interpreterpattern;

// 客户端代码
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setVariable("x", 10);

        Expression expression = new AdditionExpression(
                new NumberExpression(3),
                new GroupingExpression(
                        new SubtractionExpression(
                                new NumberExpression(5),
                                new VariableExpression("x")
                        )
                )
        );

        System.out.println(expression.interpret(context)); // 输出：-2
    }
}
