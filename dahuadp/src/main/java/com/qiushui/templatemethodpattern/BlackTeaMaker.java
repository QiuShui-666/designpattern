package com.qiushui.templatemethodpattern;

// 具体模板B：红茶制作
public class BlackTeaMaker extends TeaMaker {

    @Override
    protected void boilWater() {
        System.out.println("Boiling water for black tea.");
    }

    @Override
    protected void brewTeaLeaves() {
        System.out.println("Brewing black tea leaves.");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Pouring black tea into cup.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar to black tea.");
    }

}
