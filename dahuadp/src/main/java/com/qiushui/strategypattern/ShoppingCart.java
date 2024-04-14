package com.qiushui.strategypattern;

// 上下文
public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double totalAmount) {
        paymentStrategy.pay(totalAmount);
    }

}
