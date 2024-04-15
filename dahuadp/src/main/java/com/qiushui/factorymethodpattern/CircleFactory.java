package com.qiushui.factorymethodpattern;

// 具体工厂A
public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
