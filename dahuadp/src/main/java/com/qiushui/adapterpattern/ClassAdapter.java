package com.qiushui.adapterpattern;

// 类适配器示例
public class ClassAdapter extends AmericanPlug implements ChineseSocket {

    @Override
    public void provideElectricity() {
        supplyElectricity();
    }

}
