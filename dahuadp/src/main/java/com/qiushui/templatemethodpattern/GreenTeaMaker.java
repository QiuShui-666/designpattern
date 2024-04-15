package com.qiushui.templatemethodpattern;

// 具体模板A：绿茶制作
public class GreenTeaMaker extends TeaMaker {

    @Override
    protected void boilWater() {
        System.out.println("Boiling water for green tea.");
    }

    @Override
    protected void brewTeaLeaves() {
        System.out.println("Brewing green tea leaves.");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Pouring green tea into cup.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding honey to green tea.");
    }

}
