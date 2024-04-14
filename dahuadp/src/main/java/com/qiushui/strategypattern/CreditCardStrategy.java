package com.qiushui.strategypattern;

// 具体策略 A：信用卡支付
public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid via credit card: $" + amount);
    }

}
