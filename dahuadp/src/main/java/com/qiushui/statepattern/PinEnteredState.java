package com.qiushui.statepattern;

public class PinEnteredState implements ATMState {

    private final ATM atm;

    public PinEnteredState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Please remove your card and start over.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atm.setState(atm.getIdleState());
    }

    @Override
    public void enterPin() {
        System.out.println("PIN already entered.");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Processing cash withdrawal...");
        atm.setState(atm.getWithdrawalCompletedState());
    }

    @Override
    public void depositCash(int amount) {
        System.out.println("Processing cash deposit...");
        atm.setState(atm.getDepositCompletedState());
    }

}