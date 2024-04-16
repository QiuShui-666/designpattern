package com.qiushui.statepattern;

public class DepositCompletedState implements ATMState {
    private final ATM atm;

    public DepositCompletedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Please remove your card and start over.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected. Transaction completed.");
        atm.setState(atm.getIdleState());
    }

    @Override
    public void enterPin() {
        System.out.println("Transaction already processed. Eject your card or perform another operation.");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Please start over by inserting your card and entering your PIN.");
    }

    @Override
    public void depositCash(int amount) {
        System.out.println("A transaction is already in progress. Please wait for it to complete.");
    }

}