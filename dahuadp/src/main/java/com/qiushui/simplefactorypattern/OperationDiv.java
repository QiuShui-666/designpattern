package com.qiushui.simplefactorypattern;

public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getNumberB() == 0) {
            throw new RuntimeException("除数不能为 0");
        }
        return getNumberA() / getNumberB();
    }

}
