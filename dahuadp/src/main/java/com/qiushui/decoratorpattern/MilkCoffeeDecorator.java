package com.qiushui.decoratorpattern;

// 具体装饰器 A：添加牛奶
public class MilkCoffeeDecorator extends CoffeeDecorator {

    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.8;
    }

}
