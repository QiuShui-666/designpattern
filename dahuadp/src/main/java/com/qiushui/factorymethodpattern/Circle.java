package com.qiushui.factorymethodpattern;

// 具体产品A
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
