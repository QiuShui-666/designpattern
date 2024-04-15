package com.qiushui.abstractfactorypattern;

public class DarkTextBox implements TextBox {

    @Override
    public void display() {
        System.out.println("Dark TextBox");
    }
}
