package com.qiushui.abstractfactorypattern;

// 抽象工厂 - 主题工厂接口
public interface ThemeFactory {
    Button createButton();
    TextBox createTextBox();
    Background createBackground();
}
