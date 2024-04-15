package com.qiushui.abstractfactorypattern;

// 具体工厂 - 具体主题工厂
public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightTextBox();
    }

    @Override
    public Background createBackground() {
        return new LightBackground();
    }
}
