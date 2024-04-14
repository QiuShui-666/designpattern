package com.qiushui.strategypattern;

// 客户端
public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardStrategy());
        cart.checkout(100.0); // 输出: Paid via credit card: $100.0

        cart.setPaymentStrategy(new AlipayStrategy());
        cart.checkout(50.0);  // 输出: Paid via Alipay: $50.0
    }
}
