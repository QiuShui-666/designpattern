package com.qiushui.strategypattern;

// 具体策略B：支付宝支付
public class AlipayStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid via Alipay: $" + amount);
    }

}
