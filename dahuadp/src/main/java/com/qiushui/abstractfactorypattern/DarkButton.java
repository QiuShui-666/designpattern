package com.qiushui.abstractfactorypattern;

public class DarkButton implements Button {
    @Override
    public void display() {
        System.out.println("Displaying dark theme button.");
    }
}
