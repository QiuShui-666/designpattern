package com.qiushui.abstractfactorypattern;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkTextBox();
    }

    @Override
    public Background createBackground() {
        return new DarkBackground();
    }
}
