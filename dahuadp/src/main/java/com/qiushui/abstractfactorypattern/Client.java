package com.qiushui.abstractfactorypattern;

// 客户端
public class Client {
    public static void main(String[] args) {
        ThemeFactory lightThemeFactory = new LightThemeFactory();
        Button lightButton = lightThemeFactory.createButton();
        lightButton.display(); // 输出：Displaying light theme button.

        ThemeFactory darkThemeFactory = new DarkThemeFactory();
        Button darkButton = darkThemeFactory.createButton();
        darkButton.display(); // 输出：Displaying dark theme button.
    }
}
