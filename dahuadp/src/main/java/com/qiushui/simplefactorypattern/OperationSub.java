package com.qiushui.simplefactorypattern;

public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }

}
