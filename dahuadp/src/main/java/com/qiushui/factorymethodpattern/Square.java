package com.qiushui.factorymethodpattern;

// 具体产品B
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
