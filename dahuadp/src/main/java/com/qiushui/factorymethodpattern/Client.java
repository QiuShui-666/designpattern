package com.qiushui.factorymethodpattern;

// 客户端
public class Client {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw(); // 输出：Drawing a circle.

        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw(); // 输出：Drawing a square.
    }
}
