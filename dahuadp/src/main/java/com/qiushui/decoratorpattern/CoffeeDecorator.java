package com.qiushui.decoratorpattern;

// 装饰器接口
public abstract class CoffeeDecorator implements Coffee {

    /**
     * 被装饰的咖啡
     */
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

}
