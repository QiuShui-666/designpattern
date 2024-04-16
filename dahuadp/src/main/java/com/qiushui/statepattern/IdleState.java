package com.qiushui.statepattern;

// 具体状态 - 具体 ATM 操作状态
public class IdleState implements ATMState {

    private final ATM atm;

    public IdleState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted.");
        atm.setState(atm.getCardInsertedState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Please insert your card first.");
    }

    @Override
    public void enterPin() {
        System.out.println("Please insert your card first.");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Please insert your card and enter your PIN first.");
    }

    @Override
    public void depositCash(int amount) {
        System.out.println("Please insert your card and enter your PIN first.");
    }

}

