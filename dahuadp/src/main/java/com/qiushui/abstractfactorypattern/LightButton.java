package com.qiushui.abstractfactorypattern;

// 具体产品 - 具体图形元素
public class LightButton implements Button {
    @Override
    public void display() {
        System.out.println("Displaying light theme button.");
    }
}
