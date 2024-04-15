package com.qiushui.templatemethodpattern;

// 抽象模板
public abstract class TeaMaker {
    public final void makeTea() {
        boilWater();
        brewTeaLeaves();
        pourInCup();
        addCondiments();
    }

    protected abstract void boilWater();

    protected abstract void brewTeaLeaves();

    protected abstract void pourInCup();

    protected abstract void addCondiments();
}
