package com.qiushui.adapterpattern;

// 对象适配器示例
public class ObjectAdapter implements ChineseSocket {

    private AmericanPlug americanPlug;

    public ObjectAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void provideElectricity() {
        americanPlug.supplyElectricity();
    }

}
