package com.qiushui.statepattern;

// 客户端
public class Client {

    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.insertCard(); // 输出：Card inserted.
        atm.enterPin();   // 输出：Please enter your PIN.
        atm.requestCash(200); // 假设在 PinEnteredState 中实现请求现金逻辑
        atm.ejectCard(); // 输出：Card ejected.
    }

}
