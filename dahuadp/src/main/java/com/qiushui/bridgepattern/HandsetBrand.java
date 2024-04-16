package com.qiushui.bridgepattern;

public abstract class HandsetBrand {

    private HandsetSoft soft;

    public HandsetSoft getSoft() {
        return soft;
    }

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();

}
