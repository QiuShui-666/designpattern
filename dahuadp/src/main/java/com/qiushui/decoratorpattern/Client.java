package com.qiushui.decoratorpattern;

// 客户端
public class Client {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + ": $" + simpleCoffee.cost());

        Coffee milkCoffee = new MilkCoffeeDecorator(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + ": $" + milkCoffee.cost());

        Coffee sugarCoffee = new SugarCoffeeDecorator(simpleCoffee);
        System.out.println(sugarCoffee.getDescription() + ": $" + sugarCoffee.cost());

        Coffee milkSugarCoffee = new MilkCoffeeDecorator(new SugarCoffeeDecorator(simpleCoffee));
        System.out.println(milkSugarCoffee.getDescription() + ": $" + milkSugarCoffee.cost());
    }

}
