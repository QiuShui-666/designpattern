package com.qiushui.statepattern;

// 环境 - ATM类
public class ATM {

    private ATMState state;

    public ATM() {
        setState(new IdleState(this));
    }

    public ATMState getState() {
        return state;
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public ATMState getIdleState() {
        return new IdleState(this);
    }

    public ATMState getCardInsertedState() {
        return new CardInsertedState(this);
    }

    public ATMState getPinEnteredState() {
        return new PinEnteredState(this);
    }

    public ATMState getWithdrawalCompletedState() {
        return new WithdrawalCompletedState(this);
    }

    public ATMState getDepositCompletedState() {
        return new DepositCompletedState(this);
    }

    public void insertCard() {
        state.insertCard();
    }

    public void ejectCard() {
        state.ejectCard();
    }

    public void enterPin() {
        state.enterPin();
    }

    public void requestCash(int amount) {
        state.requestCash(amount);
    }

    public void depositCash(int amount) {
        state.depositCash(amount);
    }

}
