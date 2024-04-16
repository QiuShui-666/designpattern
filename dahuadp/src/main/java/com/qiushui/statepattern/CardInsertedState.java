package com.qiushui.statepattern;

public class CardInsertedState implements ATMState {
    private final ATM atm;

    public CardInsertedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atm.setState(atm.getIdleState());
    }

    @Override
    public void enterPin() {
        System.out.println("Please enter your PIN.");
        atm.setState(atm.getPinEnteredState());
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Please enter your PIN first.");
    }

    @Override
    public void depositCash(int amount) {
        System.out.println("Please enter your PIN first.");
    }

}

