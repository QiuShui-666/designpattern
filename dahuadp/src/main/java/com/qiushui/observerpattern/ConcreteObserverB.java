package com.qiushui.observerpattern;

// 具体观察者B
public class ConcreteObserverB implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer B received update: " + message);
    }
}
