package com.qiushui.statepattern;

// 抽象状态 - ATM操作状态接口
public interface ATMState {

    void insertCard();

    void ejectCard();

    void enterPin();

    void requestCash(int amount);

    void depositCash(int amount);

}
