package com.qiushui.abstractfactorypattern;

public class LightTextBox implements TextBox {

    @Override
    public void display() {
        System.out.println("Displaying light theme text box");
    }

}
