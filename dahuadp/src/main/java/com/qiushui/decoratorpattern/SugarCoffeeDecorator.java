package com.qiushui.decoratorpattern;

// 具体装饰器 B：添加糖
public class SugarCoffeeDecorator extends CoffeeDecorator {

    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 0.6;
    }

}
