package com.qiushui.factorymethodpattern;

// 具体工厂B
public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
