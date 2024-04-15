package com.qiushui.observerpattern;

// 客户端
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        subject.registerObserver(observerA);
        subject.registerObserver(observerB);

        subject.changeState("New State");
    }
}
