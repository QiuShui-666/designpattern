package com.qiushui.decoratorpattern;

// 具体组件
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double cost() {
        return 1.0;
    }

}
