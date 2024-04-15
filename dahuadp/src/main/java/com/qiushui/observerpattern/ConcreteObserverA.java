package com.qiushui.observerpattern;

// 具体观察者A
public class ConcreteObserverA implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer A received update: " + message);
    }
}
