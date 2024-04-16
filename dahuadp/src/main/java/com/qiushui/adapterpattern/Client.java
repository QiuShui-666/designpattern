package com.qiushui.adapterpattern;

// 客户端代码
public class Client {

    public static void main(String[] args) {
        ChineseSocket classAdapter = new ClassAdapter();
        classAdapter.provideElectricity();

        AmericanPlug americanPlug = new AmericanPlug();
        ChineseSocket objectAdapter = new ObjectAdapter(americanPlug);
        objectAdapter.provideElectricity();
    }

}
